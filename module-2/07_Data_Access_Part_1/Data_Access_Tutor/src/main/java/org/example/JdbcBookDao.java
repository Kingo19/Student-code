package org.example;

//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.support.rowset.SqlRowSet;
//
//import javax.sql.DataSource;
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//public class JdbcBookDao {
//
//    private final JdbcTemplate jdbcTemplate;
//
//
//    public JdbcBookDao(DataSource dataSource) {
//        jdbcTemplate = new JdbcTemplate(dataSource);
//    }
//
//    public void getBooks() {
//        String sql = "SELECT book_id, author_id, title, price, " +
//                "publish_date, out_of_print FROM book;";
//        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
//
//        int bookId = result.getInt("book_id");
//        int authorId = result.getInt("author_id");
//        String title = result.getNString("title");
//        BigDecimal price = result.getBigDecimal("price");
//        LocalDate publishDate = result.getDate("publish_date").toLocalDate();
//        boolean isOutOfPrint = result.getBoolean("out_of_print");
//
//        // Print the retrieved data
//        System.out.println("Book ID: " + bookId);
//        System.out.println("Author ID: " + authorId);
//        System.out.println("Title: " + title);
//        System.out.println("Price: " + price);
//        System.out.println("Publish Date: " + publishDate);
//        System.out.println("Out of Print: " + isOutOfPrint);
//        System.out.println();
//
//
//    }
//}

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class JdbcBookDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcBookDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void getBooks() {
        String sql = "SELECT book_id, author_id, title, price, " +
                "publish_date, out_of_print FROM book;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {
            int bookId = results.getInt("book_id");
            int authorId = results.getInt("author_id");
            String title = results.getString("title");
            BigDecimal price = results.getBigDecimal("price");
            LocalDate publishDate = results.getDate("publish_date").toLocalDate();
            boolean isOutOfPrint = results.getBoolean("out_of_print");

            // Print the retrieved data
            System.out.println("Book ID: " + bookId);
            System.out.println("Author ID: " + authorId);
            System.out.println("Title: " + title);
            System.out.println("Price: " + price);
            System.out.println("Publish Date: " + publishDate);
            System.out.println("Out of Print: " + isOutOfPrint);
            System.out.println();
        }
    }

}
