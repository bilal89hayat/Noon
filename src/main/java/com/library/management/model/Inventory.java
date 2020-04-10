package com.library.management.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long Id;
    private int count;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return count == inventory.count &&
                Objects.equals(Id, inventory.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, count);
    }
}
