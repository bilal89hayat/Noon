package com.library.management.repository;

import com.library.management.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Booksrepository extends JpaRepository<Books, Long>, QuerydslPredicateExecutor<Books> {

/*    long deleteByBookName(String bookName);                       //derived queries

    long deleteByPublisherName(String publisherName);

    Books findByBookId(Long bookId);

    Optional<Books> findByBookNameAndPublisherName(String bookName, String publisherName);

    @Query("Select b from Books b where b.publisherName LIKE %:publisherName")
        //JPQL
    List<Books> searchByPublisherName(@Param("publisherName") String publisherName);


    @Query("Select new com.library.management.model.Books(b.bookName, b.authorName) from Books b where b.bookName = ?1 and b.publisherName=?2")
        //JPQL
    List<Books> searchByBookName(@Param("bookName") String bookName);*/
}
