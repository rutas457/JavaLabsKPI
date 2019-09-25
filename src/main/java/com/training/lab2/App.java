package com.training.lab2;

import com.training.lab2.controller.Controller;
import com.training.lab2.model.TeacherNotebook;
import com.training.lab2.view.View;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Controller controller =
                new Controller(new TeacherNotebook(new ArrayList<>()), new View());

        controller.processUser();
    }
}
