package com.training.lab4.model.entity;


import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public abstract class Animal {

    private String name;
    public abstract void makeSound();
}
