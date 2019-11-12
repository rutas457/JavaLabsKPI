package com.training.lab4.model;

public class NoFreeCageException extends RuntimeException {
    public NoFreeCageException(String errorMessage) {
        super(errorMessage);
    }
}
