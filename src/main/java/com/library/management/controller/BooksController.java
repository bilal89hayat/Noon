package com.library.management.controller;


import com.library.management.model.Books;
import com.library.management.model.Response;
import com.library.management.service.BooksService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/books")
public class BooksController {


    private BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @PostMapping(value = "/add")
    public ResponseEntity<Books> addBooks(@RequestBody Books books){
        return new ResponseEntity<Books>(booksService.save(books), HttpStatus.OK);

    }

    @DeleteMapping(value = "/deleteByName/{bookName}")
    public ResponseEntity<Response> deleteBooksByName(@PathVariable String bookName){
      return booksService.deleteByBookName(bookName);
   }

    @DeleteMapping(value = "/deleteByPublisherName/{publisherName}")
    public ResponseEntity<Response> deleteBooksByPublisherName(@PathVariable String publisherName){
           return booksService.deleteByPublisherName(publisherName);
    }
}
