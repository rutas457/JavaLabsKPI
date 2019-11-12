package com.training.lab4.model;

public class NoFreeCageException extends Exception {
    public NoFreeCageException(String errorMessage) {
        super(errorMessage);
    }
}
