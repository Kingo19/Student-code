package org.example;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

//public class BookStoreApp {
//    public static void main(String[] args) {
//        BookStoreApp bookStoreApp = new BookStoreApp();
//        bookStoreApp.run();
//
//
//    }
//
//    private void run() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/bookstore");
//        dataSource.setUsername("postgres");
//        dataSource.setPassword("postgres1");
//
//        JdbcBookDao jdbcBookDao = new JdbcBookDao(dataSource);
//        JdbcAuthorDao jdbcAuthorDao = new JdbcAuthorDao(dataSource);
//
//        jdbcAuthorDao.getAuthors();
//        jdbcBookDao.getBooks();
//
//    }
//
//
//}

import javax.sql.DataSource;

public class BookStoreApp {

    public static void main(String[] args) {
        BookStoreApp bookstoreApp = new BookStoreApp();
        bookstoreApp.run();
    }

    public void run() {
        // Instantiate datasource and set connection string
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/bookstore");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        // Create JdbcTemplate instance using the DataSource
      //  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // You can use the jdbcTemplate to perform database operations
        // For example, retrieving authors using JdbcAuthorDao
        JdbcAuthorDao authorDao = new JdbcAuthorDao(dataSource);
        JdbcBookDao bookDao = new JdbcBookDao(dataSource);
        authorDao.getAuthors();
        bookDao.getBooks();


    }


}
