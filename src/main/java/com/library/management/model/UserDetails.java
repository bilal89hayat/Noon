package com.library.management.model;

import org.hibernate.validator.constraints.EAN;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long userId;
    private String userName;
    private Date createdDate;
    private Boolean isMemberShipActive;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getMemberShipActive() {
        return isMemberShipActive;
    }

    public void setMemberShipActive(Boolean memberShipActive) {
        isMemberShipActive = memberShipActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetails that = (UserDetails) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(isMemberShipActive, that.isMemberShipActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, createdDate, isMemberShipActive);
    }
}
