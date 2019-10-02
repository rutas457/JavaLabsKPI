package com.training.lab3.model.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum PassTime {
    MORNING(9, 13),
    DAY(13, 19),
    ALL_DAY(9, 19),
    LIMITED;

    private int lowerLimit;
    private int upperLimit;
}
