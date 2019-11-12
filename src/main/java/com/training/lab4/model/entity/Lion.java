package com.training.lab4.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Lion extends Mammal {
    @Override
    void makeSound() {
        System.out.println("Roaaar");
    }
}
