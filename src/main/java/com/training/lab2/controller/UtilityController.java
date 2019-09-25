package com.training.lab2.controller;

import com.training.lab2.view.View;

import java.util.Scanner;

class UtilityController {
    private Scanner scanner;
    private View view;

    UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while (!(scanner.hasNext() &&
                (res = scanner.next()).matches(View.bundle.getString(regex)))) {
            view.printWrongStringInput(message);
        }
        return res;
    }
}