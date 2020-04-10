package com.library.management.service.impl;

import com.library.management.model.Books;
import com.library.management.model.Response;
import com.library.management.repository.Booksrepository;
import com.library.management.service.BooksService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.groupingBy;


@Service
public class BooksServiceImpl implements BooksService {

    private Booksrepository booksrepository;

    public BooksServiceImpl(Booksrepository booksrepository) {
        this.booksrepository = booksrepository;
    }

    /*@Override
    public Books save(Books books) {
        return booksrepository.save(books);
    }


    @Override
    public ResponseEntity<Response> deleteByBookName(String name) {

        long noOfBooks = booksrepository.deleteByBookName(name);

        if (noOfBooks == 0) {
            return new ResponseEntity<Response>(new Response("No Book Found with Name  : ",name), HttpStatus.OK);
        }
        return new ResponseEntity<Response>(new Response("No of Books Deleted with  Name  : " ,name), HttpStatus.OK);
    }
*/
    /*@Override
    public ResponseEntity<Response> deleteByPublisherName(String publisherName) {

        long noOfBooks = booksrepository.deleteByPublisherName(publisherName);

        if (noOfBooks == 0) {
            return new ResponseEntity<Response>(new Response("No Book Found with PubLisher Name  : ", publisherName), HttpStatus.OK);
        }
        return new ResponseEntity<Response>(new Response("No Book Deleted with PubLisher Name  : " ,publisherName), HttpStatus.OK);
    }

    @Override
    public Books updateInventory(Books books) {
        return null;
    }

    @Override
    public Optional<Books> findByBookNameAndPublisherName(String bookName, String publisherName) {

        return booksrepository.findByBookNameAndPublisherName(bookName, publisherName);
    }
*/
    @Override
    public List<Books> saveAll(List<Books> books) {
        return booksrepository.saveAll(books);
    }

   /* @Override
    public Map<String, List<Books>> getAll() {
        List<Books> booksList = booksrepository.findAll();
        Map<String, List<Books>> collect = booksList.stream().collect(groupingBy(Books::getPublisherName));
        return collect;
    }
*/
    /*@Override
    public List<Books> searchByPublisherName(String publisherName) {
        return booksrepository.searchByPublisherName(publisherName);
    }

    @Override
    public List<Books> searchByBookName(String bookName) {
        return booksrepository.searchByBookName(bookName);
    }*/
}
