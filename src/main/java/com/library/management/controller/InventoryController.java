package com.library.management.controller;

import com.library.management.model.Books;
import com.library.management.repository.Booksrepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/inventory")
public class InventoryController {


private Booksrepository booksrepository;

    public InventoryController(Booksrepository booksrepository) {
        this.booksrepository = booksrepository;
    }


   /* @GetMapping("/{bookId}")
    public int getInventory(@PathVariable Long bookId){

        Books books = booksrepository.findByBookId(bookId);
        return books.getInventory().getCount();
    }*/

}
