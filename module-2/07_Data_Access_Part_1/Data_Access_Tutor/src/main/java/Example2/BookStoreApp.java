package Example2;

import org.apache.commons.dbcp2.BasicDataSource;
import org.example.JdbcAuthorDao;
import org.example.JdbcBookDao;

public class BookStoreApp {
    public static void main(String[] args) {
        org.example.BookStoreApp bookstoreApp = new org.example.BookStoreApp();
        bookstoreApp.run();
    }

    private void run() {
        // Instantiate datasource and set connection string
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/bookstore");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        org.example.JdbcAuthorDao authorDao = new JdbcAuthorDao(dataSource);
        org.example.JdbcBookDao bookDao = new JdbcBookDao(dataSource);

        authorDao.getAuthors();
        bookDao.getBooks();
    }

}
