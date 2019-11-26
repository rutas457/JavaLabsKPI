package com.training.lab5.task1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller {

    public void processInput(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        System.out.println(findStringWithMaxWords(sc));
    }

    private String findStringWithMaxWords(Scanner sc) {
        int max = 0;
        String result = null;
        while (sc.hasNext()) {
            String temp = sc.nextLine();
            int currentLength = temp.split(" ").length;
            if (max < currentLength) {
                max = currentLength;
                result = temp;
            }
        }
        return result;
    }
}
