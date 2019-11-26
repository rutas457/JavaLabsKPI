package com.training.lab5.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;


public class ControllerLab5Test {

    private Controller controller;

    @BeforeEach
    public void setUp() {
        controller = new Controller();
    }

    @Test
    public void processInput_ThrowsException_InvalidPath() throws FileNotFoundException {
        Assertions.assertThrows(FileNotFoundException.class,
                () -> controller.processInput(new File("taskNotExists.txt")));
    }

    @Test
    public void processInput_Executes_RightPath() throws FileNotFoundException {
        try {
            Method method = controller.getClass().getDeclaredMethod("findStringWithMaxWords", Scanner.class);
            method.setAccessible(true);
            String actual = (String) method
                    .invoke(controller, new Scanner("src\\main\\resources\\task1.txt"));
            Assertions.assertEquals("bla bla bla bla bla bla x5+",
                    actual
            );

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}