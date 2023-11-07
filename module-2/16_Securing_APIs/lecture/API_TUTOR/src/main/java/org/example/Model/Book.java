package org.example.Model;

import java.time.LocalDate;

public class Book {
    private int bookId;
    private int authorId;
    private double price;
    private String title;
    private LocalDate publishedDate;
    private boolean outOfPrint;

    public Book(int bookId, int authorId, double price, String title, LocalDate publishedDate, boolean outOfPrint) {
        this.bookId = bookId;
        this.authorId = authorId;
        this.price = price;
        this.title = title;
        this.publishedDate = publishedDate;
        this.outOfPrint = outOfPrint;
    }

    public Book() {

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public boolean isOutOfPrint() {
        return outOfPrint;
    }

    public void setOutOfPrint(boolean outOfPrint) {
        this.outOfPrint = outOfPrint;
    }
}
