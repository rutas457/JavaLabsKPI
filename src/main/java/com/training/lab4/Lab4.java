package com.training.lab4;

import com.training.lab4.controller.Controller;
import com.training.lab4.model.Zoo;
import com.training.lab4.model.cage.Cage;
import com.training.lab4.model.entity.Animal;

import java.util.ArrayList;

public class Lab4 {

    public static void main(String[] args) {
        new Controller(new Zoo(new ArrayList<Cage>())).processUser();

    }
}
