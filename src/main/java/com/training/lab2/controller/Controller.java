package com.training.lab2.controller;

import com.training.lab2.model.Notebook;
import com.training.lab2.model.TeacherNotebook;
import com.training.lab2.view.View;

import java.sql.Date;
import java.util.Scanner;

public class Controller {

    private Notebook model;
    private View view;

    public Controller(Notebook model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

    }

    private void addNotebook(TeacherNotebook teacherNotebook, Scanner sc){
        InputNoteNotebook inputNoteNoteBook =
                new InputNoteNotebook(view, sc);
        inputNoteNoteBook.inputNote();

        model.setName(inputNoteNoteBook.getName());
        model.setSurname(inputNoteNoteBook.getSurname());

        model.setHomePhoneNumber(inputNoteNoteBook.getHomePhoneNumber());

        model.setAddress(view.concatenationString(
                inputNoteNoteBook.getIndex() + " ",
                inputNoteNoteBook.getCity() + " ",
                inputNoteNoteBook.getStreet() + " ",
                inputNoteNoteBook.getHouseNumber() + " ",
                inputNoteNoteBook.getApartmentNumber() + " "
        ));

        model.setDateOfBirth(Date.valueOf(inputNoteNoteBook.getDateOfBirth()));
    }
}
