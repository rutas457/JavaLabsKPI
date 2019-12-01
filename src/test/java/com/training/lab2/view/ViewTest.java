package com.training.lab2.view;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViewTest {

    private View view;

    @Test
    void concatenationString() {
        view = new View();
        assertEquals("HiHi", view.concatenationString("Hi", "Hi"));
    }
}