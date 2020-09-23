package com.versioning.apiexample.v2.exceptions;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}