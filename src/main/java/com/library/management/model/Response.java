package com.library.management.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -942141428228473433L;

    private String message;
    private String status;


    public Response(String message, String error) {
        super();
        this.message = message;
        this.status = error;
    }

}
