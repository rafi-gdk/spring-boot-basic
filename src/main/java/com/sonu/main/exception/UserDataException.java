package com.sonu.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserDataException extends RuntimeException {

    public UserDataException(String message) {
        super(message);
    }

    public UserDataException(Exception ex) {
        super(ex);
    }

}
