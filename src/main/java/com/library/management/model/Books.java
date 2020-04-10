package com.library.management.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
/*@NamedQueries({@NamedQuery(name = "findAuthorName", query = "Select ")})*/
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long bookId;
    @NotNull(message = "bookName can't be null ")
    @NotEmpty(message = "bookName can't be empty ")
    private String bookName;
    private String authorName;
    /*private String publisherName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="inv_id", referencedColumnName = "id")
    private Inventory inventory;

    public Books(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

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

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Objects.equals(bookId, books.bookId) &&
                Objects.equals(bookName, books.bookName) &&
                Objects.equals(authorName, books.authorName) &&
                Objects.equals(publisherName, books.publisherName) &&
                Objects.equals(inventory, books.inventory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookName, authorName, publisherName, inventory);
    }*/

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
}
