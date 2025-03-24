package com.example.lambda.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = { Exception.class })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleInvalidCallException(Exception e) {
        return e.getMessage();
    }

}
