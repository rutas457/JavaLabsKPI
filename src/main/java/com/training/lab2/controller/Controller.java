package com.training.lab2.controller;

import com.training.lab2.model.Notebook;
import com.training.lab2.model.TeacherNotebook;
import com.training.lab2.view.View;

import java.util.Scanner;

public class Controller {

    private TeacherNotebook teacherNotebook;
    private View view;

    public Controller(TeacherNotebook model, View view) {
        this.teacherNotebook = model;
        this.view = view;
    }

    public void processUser() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            addNotebook(sc);
        }

    }

    private void addNotebook(Scanner sc) {

        InputNoteNotebook inputNoteNoteBook =
                new InputNoteNotebook(view, sc);
        inputNoteNoteBook.inputNote();

        Notebook model = new Notebook();

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

        model.setDateOfBirth(inputNoteNoteBook.getDateOfBirth());

        teacherNotebook.getNotebookList().add(model);

        teacherNotebook.printAllNotebooks();
    }
}
