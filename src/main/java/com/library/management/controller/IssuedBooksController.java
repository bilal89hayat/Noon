/*
package com.library.management.controller;

import com.library.management.model.IssuedBooks;
import com.library.management.model.Response;
import com.library.management.service.IssuedBookservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/issued")
public class IssuedBooksController {

    private IssuedBookservice issuedBookservice;

    public IssuedBooksController(IssuedBookservice issuedBookservice) {
        this.issuedBookservice = issuedBookservice;
    }

    @PostMapping
    public List<IssuedBooks> booksIssued(@RequestBody List<IssuedBooks> issuedBooks){

        return issuedBookservice.save(issuedBooks);
    }

    @GetMapping("/{userId}")
    public List<IssuedBooks> getIssuedBooks(@PathVariable Long userId){
       return issuedBookservice.findByUserId(userId);
    }

    @PutMapping("/updateReturnDate/{userId}")
    public ResponseEntity<?> update(@RequestBody List<IssuedBooks> issuedBooks, @PathVariable Long userId){

        try
        {
            List<IssuedBooks> oldIssuedBooks = issuedBookservice.findByUserId(userId);
            for(int i =0; i < issuedBooks.size(); i++){
                oldIssuedBooks.get(i).setReturnDate(issuedBooks.get(i).getReturnDate());
            }
             return new ResponseEntity<List<IssuedBooks>>(issuedBookservice.save(oldIssuedBooks), HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<Response>(new Response("Could Not Update",""), HttpStatus.OK);
        }
    }
}
*/
