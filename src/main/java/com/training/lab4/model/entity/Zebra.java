package com.training.lab4.model.entity;

import com.training.lab4.model.entity.Ungulate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Zebra extends Ungulate {
    @Override
    void makeSound() {
        System.out.println("Tygydyk");
    }
}
