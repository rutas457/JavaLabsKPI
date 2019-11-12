package com.training.lab4.model.cage;

import com.training.lab4.model.entity.Lion;

public class LionCage<T extends Lion>  extends MammalCage {
    public LionCage(int capacity) {
        super(capacity);
    }
}
