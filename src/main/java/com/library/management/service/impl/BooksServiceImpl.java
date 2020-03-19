package com.library.management.service.impl;

import com.library.management.model.Books;
import com.library.management.model.Response;
import com.library.management.repository.Booksrepository;
import com.library.management.service.BooksService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
public class BooksServiceImpl implements BooksService {

    private Booksrepository booksrepository;

    public BooksServiceImpl(Booksrepository booksrepository) {
        this.booksrepository = booksrepository;
    }

    @Override
    public Books save(Books books) {
        return booksrepository.save(books);
    }



    @Override
    public ResponseEntity<Response> deleteByBookName(String name) {

        long noOfBooks =booksrepository.deleteByBookName(name);

        if(noOfBooks==0){
            return new ResponseEntity<Response>(new Response("No Book Found with Name  : " + name), HttpStatus.OK);
        }
        return new ResponseEntity<Response>(new Response("No of Books Deleted with  Name  : " + name), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Response> deleteByPublisherName(String publisherName) {

        long noOfBooks =booksrepository.deleteByPublisherName(publisherName);

        if(noOfBooks==0){
          return new ResponseEntity<Response>(new Response("No Book Found with PubLisher Name  : " + publisherName), HttpStatus.OK);
        }
        return new ResponseEntity<Response>(new Response("No Book Deleted with PubLisher Name  : " + publisherName), HttpStatus.OK);
    }
}
