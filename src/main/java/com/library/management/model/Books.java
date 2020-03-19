package com.library.management.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long bookId;
    private String bookName;
    private String authorName;
    private String publisherName;
    private int inventory;


    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return inventory == books.inventory &&
                Objects.equals(bookId, books.bookId) &&
                Objects.equals(bookName, books.bookName) &&
                Objects.equals(authorName, books.authorName) &&
                Objects.equals(publisherName, books.publisherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookName, authorName, publisherName, inventory);
    }
}
