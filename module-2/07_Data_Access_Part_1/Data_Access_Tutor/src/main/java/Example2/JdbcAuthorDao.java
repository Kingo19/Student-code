package Example2;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JdbcAuthorDao {
    private final JdbcTemplate jdbcTemplate;

    public JdbcAuthorDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    private Author mapToAuthor(SqlRowSet result) {
        Author author = new Author();
        author.setAuthorId(result.getInt("author_id"));
        author.setFirstName(result.getString("first_name"));
        author.setLastName(result.getString("last_name"));

        return author;
    }

    private List<Author> getAuthors() {
        List <Author> authors = new ArrayList<>();
        String sql = "SELECT author_id, first_name, last_name FROM author;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next() ) {
            Author author = mapToAuthor(results);
            authors.add(author);
        }

        return authors;


    }

}
