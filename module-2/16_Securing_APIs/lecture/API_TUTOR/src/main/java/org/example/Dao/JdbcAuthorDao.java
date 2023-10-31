package org.example.Dao;

import org.example.Model.Author;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcAuthorDao {
    private final JdbcTemplate jdbcTemplate;

    public JdbcAuthorDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public List<Author> getAllAuthors() {
        // Needs some effort
      List <Author> author = new ArrayList<>();
      String sql = "SELECT * FROM author;";
      SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
      while (result.next()) {
          Author author1 = mapRowToAuthor(result);
          author.add(author1);
      }
      return author;
    }

    public Author getAuthorById(int id){
        Author author;
        String sql = "SELECT * FROM author WHERE author_id = ?; ";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, id);
        if (result.next()) {
            return mapRowToAuthor(result);
        } else {
            return null;
        }
    }

    public Author createNewAuthor(Author author) {
        Author newAuthor = null;
        String sql = "INSERT INTO author (first_name, last_name) " + "VALUES (?, ?) RETURNING author_id;";
        int newId = jdbcTemplate.queryForObject(sql, int.class, author.getFirstName(), author.getLastName());
        newAuthor = getAuthorById(newId);
        return newAuthor;
    }
    public Author updateAuthor(Author author) {
        Author updatedAuthor = null;
        String sql = "UPDATE author SET first_name = ?, last_name = ? " +
                "WHERE author_id = ?;";
        jdbcTemplate.update(sql, author.getFirstName(), author.getLastName(), author.getAuthorId());
        updatedAuthor = getAuthorById(author.getAuthorId());
        return updatedAuthor;

    }

    public void deleteAuthor(int id) {
        String sql = "DELETE FROM author WHERE author_id = ?;";
        jdbcTemplate.update(sql, id);


    }
    public Author mapRowToAuthor(SqlRowSet result) {
        Author author = new Author();
        author.setAuthorId(result.getInt("author_id"));
        author.setFirstName(result.getString("first_name"));
        author.setLastName(result.getString("Last_name"));
        return author;
    }

}
