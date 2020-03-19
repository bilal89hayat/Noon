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
    private Date createdDate;
    private Date updatedDate;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserDetails userDetails;


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

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fine fine = (Fine) o;
        return amount == fine.amount &&
                Objects.equals(id, fine.id) &&
                Objects.equals(createdDate, fine.createdDate) &&
                Objects.equals(updatedDate, fine.updatedDate) &&
                Objects.equals(userDetails, fine.userDetails) &&
                Objects.equals(bookId, fine.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, createdDate, updatedDate, userDetails, bookId);
    }
}
