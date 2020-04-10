package com.library.management.repository;

import com.library.management.model.IssuedBooks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IssuedBooksRepository extends JpaRepository<IssuedBooks, Long> {

    List<IssuedBooks> findByUserId(Long userid);

}
