package com.library.management.repository;

import com.library.management.model.Fine;
import com.library.management.model.IssuedBooks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FineRepository extends JpaRepository<Fine, Long> {


    List<Fine> findByUserId(Long userId);
}
