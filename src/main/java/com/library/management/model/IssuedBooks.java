package com.library.management.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class IssuedBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    @Column(name = "book_id")
    private Long bookId;
    @Column(name = "user_id")
    private Long userId;
    @Temporal(TemporalType.DATE)
    private Date issuedDate;
    @Temporal(TemporalType.DATE)
    private Date returnDate;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IssuedBooks that = (IssuedBooks) o;
        return Objects.equals(Id, that.Id) &&
                Objects.equals(bookId, that.bookId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(issuedDate, that.issuedDate) &&
                Objects.equals(returnDate, that.returnDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, bookId, userId, issuedDate, returnDate);
    }
}
