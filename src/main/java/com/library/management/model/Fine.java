package com.library.management.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Fine {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private int amount;
    private String bookId;
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Temporal(TemporalType.DATE)
    private Date updatedDate;
    private Long userId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fine fine = (Fine) o;
        return amount == fine.amount &&
                Objects.equals(id, fine.id) &&
                Objects.equals(bookId, fine.bookId) &&
                Objects.equals(createdDate, fine.createdDate) &&
                Objects.equals(updatedDate, fine.updatedDate) &&
                Objects.equals(userId, fine.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, bookId, createdDate, updatedDate, userId);
    }
}
