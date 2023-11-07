package org.example;

import org.apache.commons.dbcp2.BasicDataSource;
import org.example.Dao.JdbcAuthorDao;
import org.example.Dao.JdbcBookDao;
import org.example.Model.Book;

import java.time.LocalDate;
import java.util.List;

public class Main {
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

//        List<Book> booksList = jdbcBookDao.getAllBooks();
//        System.out.println("List of books " + booksList);
//        for (Book book : booksList) {
//            System.out.println(book.getBookId() + " " + book.getTitle());
//        }

//        Book book = jdbcBookDao.getBookById(2);
//        System.out.println(book.getAuthorId() + " " + book.getTitle() + " " + book.getPrice());

//        Book addBook = new Book();
//        addBook.setAuthorId(19);
//        addBook.setTitle("Atomic Habit");
//        addBook.setPrice(9.99);
//        addBook.setPublishedDate(LocalDate.of(2014, 05, 01));
//        addBook.setOutOfPrint(true);
//        Book createdBook = jdbcBookDao.createNewBook(addBook);
//        System.out.println(createdBook.getAuthorId() + " " + createdBook.getTitle() + " " + createdBook.getPrice() + " " + createdBook.getPublishedDate() + " " + createdBook.isOutOfPrint());

        jdbcAuthorDao.deleteAuthor(5);
        System.out.println("A book was successfully deleted");
    }


}