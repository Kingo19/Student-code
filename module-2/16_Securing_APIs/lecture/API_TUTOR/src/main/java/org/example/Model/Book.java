package org.example.Model;

public class Book {
    private int bookId;
    private int authorId;
    private int price;
    private String title;
    private String publishedDate;
    private boolean outOfPrint;

    public Book(int bookId, int authorId, int price, String title, String publishedDate, boolean outOfPrint) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public boolean isOutOfPrint() {
        return outOfPrint;
    }

    public void setOutOfPrint(boolean outOfPrint) {
        this.outOfPrint = outOfPrint;
    }
}
