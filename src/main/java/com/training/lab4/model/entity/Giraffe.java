package com.training.lab4.model.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Giraffe extends Ungulate {
    @Override
    public void makeSound() {
        System.out.println("*giraffian sound*");
    }
}
