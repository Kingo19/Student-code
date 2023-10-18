package Example2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Book {

    private int bookId;
    private String title;
    private int authorId;
    private BigDecimal price;
    private LocalDate publishDate;
    private boolean outOfPrint;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public boolean isOutOfPrint() {
        return outOfPrint;
    }

    public void setOutOfPrint(boolean outOfPrint) {
        this.outOfPrint = outOfPrint;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", authorId=" + authorId +
                ", price=" + price +
                ", publishDate=" + publishDate +
                ", outOfPrint=" + outOfPrint +
                '}';
    }

}
