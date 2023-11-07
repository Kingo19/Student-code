package org.example.Dao;

import org.example.Model.Author;
import org.example.Model.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcBookDao {
    private final JdbcTemplate jdbcTemplate;

    public JdbcBookDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List <Book> getAllBooks() {
        List <Book> books = new ArrayList<>();
        String sql = "SELECT * FROM book;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);

        while (result.next()) {
            Book book = mapRowToBook(result);
            books.add(book);
        }
        return books;
    }
    public Book getBookById(int id) {
        Book book;
        String sql = "SELECT * FROM book WHERE book_id = ?; ";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, id);
        if (result.next()) {
          return   mapRowToBook(result);
        } else {
            return null;
        }
    }

    public Book createNewBook(Book book) {
        Book newNook = null;
        String sql = "INSERT INTO (author_id, title, price, publish_date, out_of_print) VALUES (?, ?, ?, ?, ?) RETURNING book_id; ";
        int newId = jdbcTemplate.queryForObject(sql, int.class, book.getAuthorId(), book.getTitle(), book.getPrice(), book.getPublishedDate(), book.isOutOfPrint());
        newNook = getBookById(newId);
        return newNook;
    }
    public Book updateBook (Book book) {
        Book book1 = null;
        String sql = "UPDATE book author_id = ?, title = ?, price = ?, publish_date = ?, out_of_print = ?, " +
                     "WHERE book_id = ? ";
        jdbcTemplate.update(sql, book.getAuthorId(), book.getTitle(), book.getPrice(), book.getPublishedDate(), book.isOutOfPrint());
        book1 = getBookById(book.getBookId());
        return book1;
    }
    public String deleteBook(int id) {
        String sql = "DELETE FROM book where book_id = ?; ";
        jdbcTemplate.update(sql, id);
        return "A book was successfully deleted";
    }


    public Book mapRowToBook(SqlRowSet rowSet) {
        Book book = new Book();
        book.setBookId(rowSet.getInt("book_id"));
        book.setAuthorId(rowSet.getInt("author_id"));
        book.setTitle(rowSet.getString("title"));
        book.setPrice(rowSet.getDouble("price"));
        book.setPublishedDate(rowSet.getDate("publish_date").toLocalDate());
        book.setOutOfPrint(rowSet.getBoolean("out_of_print"));

        return book;
    }
}
