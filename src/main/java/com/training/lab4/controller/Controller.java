package com.training.lab4.controller;

import com.training.lab4.model.Zoo;
import com.training.lab4.model.cage.*;
import com.training.lab4.model.entity.*;
import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
public class Controller {
    private Zoo zoo;

    public void processUser() {
        generateRandomCages();
        generateRandomAnimalsToCages();
        checkWhatAnimalsAreInCages();
    }

    private void generateRandomCages() {
        int randomNumberOfCages = new Random().nextInt(101);
        for (int i = 0; i < randomNumberOfCages; i++) {
            zoo.addCage(new Cage(5));
        }
    }

    private void generateRandomAnimalsToCages(){
        List<Class<? extends Animal>> possibleAnimals = Arrays.asList(Eagle.class, Giraffe.class, Lion.class, Zebra.class);
        for (Cage cage : zoo.getCages()) {
            for (int i = 0; i < cage.getCapacity(); i++) {
                int randomAnimal = (new Random().nextInt(101) % 4);
                try {
                    cage.addAnimal(possibleAnimals.get(randomAnimal).getConstructor().newInstance());
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void checkWhatAnimalsAreInCages(){
        int numberOfCage = 1;
        for (Cage cage : zoo.getCages()) {
            System.out.println(numberOfCage);
            System.out.println("*-----------------------*");
            for (Object animal : cage.getAnimals()) {
                ((Animal) animal).makeSound();
            }
            System.out.println("*-----------------------*");
            numberOfCage++;
        }
    }
}
