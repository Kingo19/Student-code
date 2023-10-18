package org.example;

//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.support.rowset.SqlRowSet;
//
//import javax.sql.DataSource;
//
//public class JdbcAuthorDao {
//
//    private final JdbcTemplate jdbcTemplate;
//
//    public JdbcAuthorDao(DataSource dataSource) {
//        jdbcTemplate = new JdbcTemplate(dataSource);
//    }
//
//    public void getAuthors() {
////        Executes the command in data base.
//        String sql = "SELECT author_id, first_name, last_name FROM author;";
////        Reads and transports the data from the db to the Java.
//        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
////        Let's itterate via loop.
//        while (results.next()) {
//            int authorId = results.getInt("author_id");
//            String firstName = results.getString("first_name");
//            String lastName = results.getString(" last_name");
//            System.out.println("Author id: " + authorId);
//            System.out.println("First name: " + firstName);
//            System.out.println("Last name: " + lastName);
//            System.out.println();
//        }
//
//    }
//}

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;

public class JdbcAuthorDao {
//          This is a general constructor that helps us to bring the data from our data base using "jdbcTemplates".
    private final JdbcTemplate jdbcTemplate;

    public JdbcAuthorDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void getAuthors() {
        String sql = "SELECT author_id, first_name, last_name FROM author;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {
            int authorId = results.getInt("author_id");
            String firstName = results.getString("first_name");
            String lastName = results.getString("last_name");

            // Process author data (e.g., print it)
            System.out.println("Author ID: " + authorId);
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        }
    }
}
