package com.training.lab4;

import com.training.lab4.model.NoFreeCageException;
import com.training.lab4.model.cage.Cage;
import com.training.lab4.model.entity.Animal;
import com.training.lab4.model.entity.Lion;

public class Lab4 {

    public static void main(String[] args) {
        Cage<Animal> cage = new Cage<>(5);
        try {
            cage.addAnimal(new Lion());
                System.out.println("success");
        } catch (NoFreeCageException e) {
            e.printStackTrace();
        }
    }
}
