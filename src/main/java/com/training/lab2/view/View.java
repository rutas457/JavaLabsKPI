package com.training.lab2.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.training.lab2.view.Messages.WRONG_INPUT;

public class View {

    private static String MESSAGES_BUNDLE_NAME = "messages";
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
                bundle.getString(WRONG_INPUT),
                bundle.getString(message)));
    }
}
