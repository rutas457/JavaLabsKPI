package com.training.lab4.model.cage;

import com.training.lab4.model.entity.Animal;
import com.training.lab4.model.entity.Eagle;
import com.training.lab4.model.entity.Lion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CageTest {
    private Cage<Animal> cage;
    private static final int CAPACITY = 5;

    @BeforeEach
    public void setUp() {
        cage = new Cage<>(CAPACITY);
    }

    @Test
    public void getCapacity() {
        Assertions.assertEquals(CAPACITY, cage.getCapacity());
    }

    @Test
    public void getNumberOfOccupiedCages() {
        int expected = CAPACITY - 1;
        cage.addAnimal(new Eagle());
        int actual = cage.getNumberOfOccupiedCages();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addAnimal() {
        for (int i = 0; i < CAPACITY + 1; i++) {
            cage.addAnimal(new Lion());
        }
    }

}