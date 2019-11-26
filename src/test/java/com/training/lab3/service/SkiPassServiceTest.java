package com.training.lab3.service;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class SkiPassServiceTest {

    @Autowired
    SkiPassService service;


    void findPassByNumber() {
    }

    @Test
    public void generateCardNumber() {
        Assertions.assertEquals(service.generateCardNumber().length(), 7);
    }

}