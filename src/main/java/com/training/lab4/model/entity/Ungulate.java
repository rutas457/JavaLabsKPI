package com.training.lab4.model.entity;

import com.training.lab4.model.entity.Mammal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Ungulate extends Mammal {

    private int numberOfHooves;
}
