package com.training.lab5.task1;

import java.io.File;
import java.io.FileNotFoundException;

public class Task1 {

    public static void main(String[] args) {
        try {
            new Controller().processInput(new File("src\\main\\resources\\task1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
