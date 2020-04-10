package com.library.management.controller;


import com.library.management.model.Books;
import com.library.management.service.BooksService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(value = "/api/books")
public class BooksController {


    private BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    /*  @PutMapping(value = "/updateInventory")
      public ResponseEntity<Books> updateBookInventory(@RequestBody Books books) {
          return new ResponseEntity<Books>(booksService.save(books), HttpStatus.OK);
      }

      @DeleteMapping(value = "/deleteByName/{bookName}")
      public ResponseEntity<Response> deleteBooksByName(@PathVariable String bookName) {
          return booksService.deleteByBookName(bookName);
      }

      @DeleteMapping(value = "/deleteByPublisherName/{publisherName}")
      public ResponseEntity<Response> deleteBooksByPublisherName(@PathVariable String publisherName) {
          return booksService.deleteByPublisherName(publisherName);
      }

      @GetMapping(value = "/getByBookNameAndPublisherName/{bookName}/{publisherName}")
      public Optional<Books> getBooksByBookNamePublisherName(@PathVariable String bookName, @PathVariable String publisherName) throws Throwable {
          return Optional.ofNullable(booksService.findByBookNameAndPublisherName(bookName, publisherName).orElseThrow(() -> new BooksException(bookName)));
      }
  */
    @PostMapping(value = "/saveAll")
    public List<Books> getAllBooks(@RequestBody @Valid List<Books> books) {
        return booksService.saveAll(books);
    }

/*    @GetMapping(value = "/getAll")
    public Map<String, List<Books>> getAllBooks() {
        return booksService.getAll();
    }

    @GetMapping(value = "/searchByPublisherName/{publisherName}")
    public List<Books> searchByPublisherName(@PathVariable String publisherName) {
        return booksService.searchByPublisherName(publisherName);
    }

    @GetMapping(value = "/searchByBookName/{bookName}")
    public List<Books> searchByBookName(@PathVariable String bookName) {
        return booksService.searchByBookName(bookName);
    }*/
}
