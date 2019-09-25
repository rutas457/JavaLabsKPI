package com.training.lab2.model;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Notebook {
    private String name;
    private String surname;
    private String dateOfBirth;
    private String homePhoneNumber;
    private String address;
}
