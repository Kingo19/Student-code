package Example2;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcBookDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcBookDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private Book mapRowToBook(SqlRowSet results) {
        Book book = new Book();
        book.setBookId(results.getInt("book_id"));
        book.setTitle(results.getString("title"));
        book.setAuthorId(results.getInt("author_id"));
        book.setPrice(results.getBigDecimal("price"));
        if (results.getDate("publish_date") != null) {
            book.setPublishDate(results.getDate("publish_date").toLocalDate());
        }
        book.setOutOfPrint(results.getBoolean("out_of_print"));
        return book;
    }

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        String sql = "SELECT book_id, author_id, title, price, publish_date, out_of_print FROM book;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {
            Book book = mapRowToBook(results);
            books.add(book);
        }

        return books;
    }

}