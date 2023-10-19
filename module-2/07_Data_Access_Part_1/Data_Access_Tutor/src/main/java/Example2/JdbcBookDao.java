package Example2;

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
        jdbcTemplate  = new JdbcTemplate(dataSource);

    }

    public Book mapToBook(SqlRowSet results) {
        Book book = new Book();
        book.setBookId(results.getInt("book_id"));
        book.setAuthorId(results.getInt("author_id"));
        book.setTitle(results.getString("title"));
        book.setPrice(results.getBigDecimal("price"));
        book.setPublishDate(results.getDate("publish_date").toLocalDate());
        book.setOutOfPrint(results.getBoolean("out_of_print"));

        return book;
    }

    private List <Book> getBooks() {
        List<Book> book = new ArrayList<>();
        String sql = "SELECT book_id, author_id, title, price, " +
                "publish_date, out_of_print FROM book;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);

        while (result.next()) {
            Book book23 = mapToBook(result);
            book.add(book23);

        }
        return book;
    }



}
