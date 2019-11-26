package com.training.lab5.task3;

import java.util.stream.Collectors;

public class EncodeUtils {

    public String encode(String string){
         return string.chars()
                .mapToObj(x-> (char) (x+1))
                .map(String::valueOf)
                .collect(Collectors.joining());

    }

    public String decode(String string){
        return string.chars()
                .mapToObj(x-> (char) (x-1))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
