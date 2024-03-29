package com.training.lab1;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.training.lab1.Messages.INPUT_WRONG_HEIGHT;

public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("uk"));


    public void printMessage(String message) {
        System.out.println(message);
    }


    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(message)));
    }


    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_WRONG_HEIGHT),
                bundle.getString(message)));
    }
}
