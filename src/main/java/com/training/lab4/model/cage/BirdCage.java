package com.training.lab4.model.cage;

import com.training.lab4.model.entity.Bird;

public class BirdCage<T extends Bird> extends Cage{
    public BirdCage(int capacity) {
        super(capacity);
    }
}
