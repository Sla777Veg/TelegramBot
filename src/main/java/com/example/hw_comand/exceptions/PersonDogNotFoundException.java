package com.example.hw_comand.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonDogNotFoundException extends RuntimeException {

    public PersonDogNotFoundException() {
        super("PersonDog is not found!");
    }
}
