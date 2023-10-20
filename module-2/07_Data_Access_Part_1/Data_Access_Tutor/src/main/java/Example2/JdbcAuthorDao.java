package Example2;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
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

    private Author mapRowToAuthor(SqlRowSet results) {
        Author author = new Author();
        author.setAuthorId(results.getInt("author_id"));
        author.setFirstName(results.getString("first_name"));
        author.setLastName(results.getString("last_name"));
        return author;
    }

    public List<Author> getAuthors() {
        List<Author> authors = new ArrayList<>();

        String sql = "SELECT author_id, first_name, last_name FROM author;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {
            Author author = mapRowToAuthor(results);
            authors.add(author);
        }

        return authors;
    }

    public Author getAuthorById(int authorId) {
        String sql = "SELECT author_id, first_name, last_name FROM author WHERE author_id = ?;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, authorId);

        if (result.next()) {
            return mapRowToAuthor(result);
        } else {
            return null; // Author with the specified ID not found
        }
    }
    // Creating an Table value.
    public Author createAuthor(Author author){
        Author author1 = null;
        String sql = "INSERT INTO author (first_name, last_name) " + "VALUES (?, ?) returning author_id ;";
        int newAuthorId = jdbcTemplate.queryForObject(sql, int.class, author.getFirstName(), author.getLastName());
        author1 = getAuthorById(newAuthorId);
        return author1;

    }

//    Update value

    public Author UpdateValue(Author author) {
        Author author1 = null;
        String sql = "UPDATE author SET first_name = ?, last_name = ? " + "WHERE author_id = ?; ";
        int toBeUpdated = jdbcTemplate.update(sql, author.getFirstName(), author.getLastName(), author.getAuthorId());
        if (toBeUpdated == 0) {
            throw new DaoException("0 row");
        }
        author1 = getAuthorById(author.getAuthorId());
        return author1;

    }

    public int deleteAuthor (int authorId) {
        int number = 0;
        String sql = "Delete FROM author WHERE author_id = ?; ";
       number = jdbcTemplate.update(sql, authorId);
       return number;

    }


}