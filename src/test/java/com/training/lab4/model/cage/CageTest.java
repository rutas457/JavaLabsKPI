package com.training.lab4.model.cage;

import com.training.lab4.model.NoFreeCageException;
import com.training.lab4.model.entity.Animal;
import com.training.lab4.model.entity.Eagle;
import com.training.lab4.model.entity.Lion;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CageTest {
    private Cage<Animal> cage;
    private static final int CAPACITY = 5;

    @Before
    public void setUp() {
        cage = new Cage<>(CAPACITY);
    }

    @Test
    public void getCapacity() {
        Assert.assertEquals(CAPACITY, cage.getCapacity());
    }

    @Test
    public void getNumberOfOccupiedCages() {
        int expected = CAPACITY-1;
        cage.addAnimal(new Eagle());
        int actual = cage.getNumberOfOccupiedCages();
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = NoFreeCageException.class)
    public void addAnimal() {
        for(int i = 0; i < CAPACITY+1; i++) {
            cage.addAnimal(new Lion());
        }
    }
}