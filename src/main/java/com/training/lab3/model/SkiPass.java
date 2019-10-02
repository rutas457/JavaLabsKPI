package com.training.lab3.model;

import com.training.lab3.model.enumeration.PassTime;
import com.training.lab3.model.enumeration.SkiType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class SkiPass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String cardNumber;
    @Enumerated
    private SkiType skiType;
    @Enumerated
    private PassTime passTime;
    private int numberOfPasses;
    private int numberOfDays;

    private LocalDate endDate;
    private boolean blocked;

}
