package com.training.lab2.controller;

import com.training.lab2.view.Messages;
import com.training.lab2.view.Regex;
import com.training.lab2.view.View;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class InputNoteNotebook {
    private View view;
    private Scanner sc;

    private String name;
    private String surname;
    private String dateOfBirth;
    private String homePhoneNumber;
    private String index;
    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;


    InputNoteNotebook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        this.name =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_NAME, Regex.NAME);
        this.surname =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_SURNAME, Regex.NAME);

        this.dateOfBirth =
                utilityController.inputStringValueWithScanner(Messages.INPUT_DATE,
                        Regex.DATE);
        this.homePhoneNumber =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_HOME_PHONE_NUMBER, Regex.PHONE_NUMBER);
        this.index =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_INDEX, Regex.INDEX);
        this.city =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_CITY, Regex.CITY);
        this.street =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_STREET, Regex.STREET);
        this.houseNumber =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_HOUSE_NUMBER, Regex.HOUSE_NUMBER);
        this.apartmentNumber =
                utilityController.inputStringValueWithScanner
                        (Messages.INPUT_APARTMENT_NUMBER, Regex.APARTMENT_NUMBER);
    }


}
