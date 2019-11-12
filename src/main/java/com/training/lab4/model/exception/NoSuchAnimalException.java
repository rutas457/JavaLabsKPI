package com.training.lab4.model.exception;

public class NoSuchAnimalException extends RuntimeException {
    public NoSuchAnimalException(String errorMessage) {
        super(errorMessage);
    }
}
