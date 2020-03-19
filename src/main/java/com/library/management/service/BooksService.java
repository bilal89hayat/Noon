package com.library.management.service;


import com.library.management.model.Books;
import com.library.management.model.Response;
import org.springframework.http.ResponseEntity;


public interface BooksService {


    Books save(Books books);
    ResponseEntity<Response> deleteByBookName(String bookname);
    ResponseEntity<Response> deleteByPublisherName(String publisherName);
}
