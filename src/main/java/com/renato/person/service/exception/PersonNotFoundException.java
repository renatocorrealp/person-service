package com.renato.person.service.exception;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(final String message) {
        super(message);
    }
}
