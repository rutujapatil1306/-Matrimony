package com.spring.jwt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserAlreadyExistException extends RuntimeException {

    private final HttpStatus status;

    public UserAlreadyExistException(String message) {
        super(message);
        this.status = HttpStatus.NOT_FOUND;
    }
}
