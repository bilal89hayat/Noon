package com.library.management.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class BooksException extends RuntimeException {

    public BooksException(String message) {
        super("Book Not Found with " + message);
    }
}
