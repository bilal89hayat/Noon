package com.library.management.repository;

import com.library.management.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Booksrepository extends JpaRepository<Books, Long> {

       long deleteByBookName(String bookName);
       long deleteByPublisherName(String publisherName);

}
