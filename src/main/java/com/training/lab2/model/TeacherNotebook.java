package com.training.lab2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TeacherNotebook {
    private List<Notebook> notebookList;

    public void printAllNotebooks() {
        notebookList.forEach(System.out::println);
    }
}
