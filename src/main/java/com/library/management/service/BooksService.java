package com.library.management.service;


import com.library.management.model.Books;
import com.library.management.model.Response;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public interface BooksService {


    /*Books save(Books books);
    ResponseEntity<Response> deleteByBookName(String bookname);
    ResponseEntity<Response> deleteByPublisherName(String publisherName);
    Books updateInventory(Books books);
    Optional<Books> findByBookNameAndPublisherName(String bookName, String publisherName);
    */List<Books> saveAll(List<Books> books);
    /*Map<String, List<Books>> getAll();
    List<Books> searchByPublisherName(String publisherName);
    List<Books> searchByBookName(String bookName);*/
}
