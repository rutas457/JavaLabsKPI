package com.training.lab2.model;
import lombok.*;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Notebook {
    private String name;
    private String surname;
    private Date dateOfBirth;
    private String homePhoneNumber;
    private String address;
}
