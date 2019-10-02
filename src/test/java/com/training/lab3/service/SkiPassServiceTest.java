package com.training.lab3.service;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

class SkiPassServiceTest {

    @Autowired
    SkiPassService service;


    void findPassByNumber() {
    }

    @Test
    public void generateCardNumber() {
        Assert.assertEquals(service.generateCardNumber().length(), 7);
    }

}