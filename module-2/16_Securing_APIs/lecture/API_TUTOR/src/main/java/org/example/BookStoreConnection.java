package org.example;

import org.apache.commons.dbcp2.BasicDataSource;
import org.example.Dao.JdbcAuthorDao;
import org.example.Dao.JdbcBookDao;
import org.example.Model.Author;
import org.example.Model.Book;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class BookStoreConnection {


    public static void main(String[] args) {
         String url = "jdbc:postgresql://localhost:5432/bookstore";
         String userName = "postgres";
         String password = "postgres1";

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);

        JdbcBookDao jdbcBookDao = new JdbcBookDao(dataSource);
        JdbcAuthorDao jdbcAuthorDao = new JdbcAuthorDao(dataSource);

        // Implementing the method.

//        List <Author> authorList = jdbcAuthorDao.getAllAuthors();
//        System.out.println("List of Authors: " + authorList);
//        for (Author author : authorList) {
//            System.out.println(author.getFirstName() + " " + author.getLastName());
//        }

//        Author author = jdbcAuthorDao.getAuthorById(3);
//        System.out.println(author.getFirstName() + " " + author.getLastName());
//
//        Author newAuthor = new Author();
//        newAuthor.setFirstName("Hadis");
//        newAuthor.setLastName("Alemayehu");
//        Author createdAuthor = jdbcAuthorDao.createNewAuthor(newAuthor);
//        System.out.println("New Author Created: " + createdAuthor.getFirstName() + " " + createdAuthor.getLastName());

//        // todo WE WILL GET ALL LISTS INORDER TO POINT OUT THE ACTUAL UPDATED OBJECT
//        List <Author> authorList = jdbcAuthorDao.getAllAuthors();
//        // todo WE WILL PASS THE THE ACTUAL OBJECT USING INDEX
//        Author authorTobeUpdated =  authorList.get(1);
//        // todo  WE WILL SET THE ATRIBUTES
//       authorTobeUpdated.setFirstName("Bealu");
//       authorTobeUpdated.setLastName("Girma");
//       // todo WE WILL CALL THE METHOD WHICH WE CREATED IN THE DAO CLASS
//       jdbcAuthorDao.updateAuthor(authorTobeUpdated);
//       System.out.println("Updated Author: " + authorTobeUpdated.getFirstName() + " " + authorTobeUpdated.getLastName());

//       jdbcAuthorDao.deleteAuthor(14);
//       System.out.println("An author was successfully deleted");



    }

}
