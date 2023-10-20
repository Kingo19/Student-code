package Example2;

import org.springframework.jdbc.core.JdbcTemplate;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.util.List;

public class BookStoreApp {

    public static void main(String[] args) {
        // Create a data source and set connection details
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/bookstore");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        // Create JdbcTemplate instance using the DataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // Create instances of JdbcAuthorDao and JdbcBookDao
        JdbcAuthorDao authorDao = new JdbcAuthorDao(dataSource);
        JdbcBookDao bookDao = new JdbcBookDao(dataSource);

        // Call the methods to retrieve authors and books
        authorDao.getAuthors();
        bookDao.getBooks();

//        Create new author
        Author author12 = new Author();
        author12.setFirstName("King");
        author12.setLastName("Solomon");

//        Author cretedAuthor = authorDao.createAuthor(author12);
//        System.out.println("New Author: " );
//        System.out.println(cretedAuthor);

        // Update a value.

        List<Author> authors = authorDao.getAuthors();
        Author updatedAuthor = authors.get(5);
        updatedAuthor.setFirstName("Nigus");
        updatedAuthor.setLastName("Gebremariam");
//
//        Author updatedAuthor1 = authorDao.UpdateValue(updatedAuthor);
//        System.out.println("Updated value: ");
//        System.out.println(updatedAuthor1);

//         Delete a value.

        Author deleteAuthor = authors.get(4);
        int numOfRow = authorDao.deleteAuthor(deleteAuthor.getAuthorId());

//        System.out.println("Deleted row: ");
//        System.out.println(numOfRow);




    }




}