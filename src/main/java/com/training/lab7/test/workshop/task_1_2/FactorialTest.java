package com.training.lab7.test.workshop.task_1_2;

import com.training.lab7.src.workshop.task_1_2.Factorial;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by olenasyrota on 6/28/16.
 */
public class FactorialTest {

    @Test
    public void factorial_EdgeParameter() {
        long i = 1;
        Assert.assertEquals(1, Factorial.factorial(i));

    }

    @Test
    public void factorial_NormalParameter() {
        long i = 5;
        assertEquals(120, Factorial.factorial(i));
    }

}