/*
package com.library.management.service.impl;

import com.library.management.model.IssuedBooks;
import com.library.management.repository.Booksrepository;
import com.library.management.repository.IssuedBooksRepository;
import com.library.management.service.IssuedBookservice;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

@Service
public class IssuedBookServiceImpl implements IssuedBookservice {

    private IssuedBooksRepository issuedBooksRepository;
    private Booksrepository booksrepository;

    public IssuedBookServiceImpl(IssuedBooksRepository issuedBooksRepository) {
        this.issuedBooksRepository = issuedBooksRepository;
    }

    @Override
    public List<IssuedBooks> findByUserId(Long userid) {
        return issuedBooksRepository.findByUserId(userid);
    }

    @Override
    public List<IssuedBooks> save(List<IssuedBooks> issuedBooks) {

        //decrement books from books table
        Map<Long, List<IssuedBooks>> listMap = issuedBooks.stream().collect(groupingBy(ele->ele.getBookId()));

        Iterator<Long> iterator = listMap.keySet().iterator();

        while(iterator.hasNext()){

            Long bookId = iterator.next();

            //int currentInventory = booksrepository.findByBookId(bookId).getInventory().getCount();

            Long inventoryId = booksrepository.findByBookId(bookId).getInventory().getId();
            long newInventory = listMap.get(bookId).stream().count();

            //make inventory repository and update this new count.


        }

       // booksrepository.findByBookId();

        return issuedBooksRepository.saveAll(issuedBooks);
    }

}
*/
