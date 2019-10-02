package com.training.lab2;

import com.training.lab2.controller.Controller;
import com.training.lab2.model.Notebook;
import com.training.lab2.model.TeacherNotebook;
import com.training.lab2.view.View;

import java.util.ArrayList;

public class Lab2 {

    public static void main(String[] args) {
        Controller controller =
                new Controller(new TeacherNotebook(new ArrayList<Notebook>()), new View());

        controller.processUser();
    }
}
