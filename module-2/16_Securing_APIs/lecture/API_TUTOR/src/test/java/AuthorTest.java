import org.apache.commons.dbcp2.BasicDataSource;
import org.example.BookStoreConnection;
import org.example.Dao.JdbcAuthorDao;
import org.example.Model.Author;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class AuthorTest {
    JdbcAuthorDao jdbcAuthorDao;

    BookStoreConnection book = new BookStoreConnection();
//  @BeforeEach
//    public void setUp () {
//      String url = "jdbc:postgresql://localhost:5432/bookstore";
//      String userName = "postgres";
//      String password = "postgres1";
//
//      BasicDataSource dataSource = new BasicDataSource();
//
//      dataSource.setUrl(url);
//      dataSource.setUsername(userName);
//      dataSource.setPassword(password);
//
//      jdbcAuthorDao = new JdbcAuthorDao(dataSource);
//  }

  @Test
    public void createAuthor() {
      Author author = new Author();
      author.setFirstName("Abebe");
      author.setLastName("Kebede");

      Author newAuthor = jdbcAuthorDao.createNewAuthor(author);

    Assertions.assertNotNull(newAuthor);


  }

}
