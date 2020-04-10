package com.library.management.service.impl;

import com.library.management.model.Books;
import com.library.management.repository.Booksrepository;
import com.library.management.service.InventoryService;

public class InventoryServiceImpl implements InventoryService {

    private Booksrepository booksrepository;

    public InventoryServiceImpl(Booksrepository booksrepository) {
        this.booksrepository = booksrepository;
    }

   /* @Override
    public int findInventoryById(Long bookId) {
        return booksrepository.findByBookId(bookId).getInventory().getCount();
    }*/
}
