package com.training.lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab7 {
    public static void main(String[] args) throws IOException {
       task("fuck gg back");
    }
//5.	Знайти слова, які складаються тільки з різних символів. На виході – масив String.
    public static List<String> task(String string) throws IOException {
        Files.lines(Paths.get("src\\main\\resources\\task1.txt"))
                .map(line -> line.split(" ")) // Stream<String[]>
                .flatMap(Arrays::stream) // Stream<String>
                .distinct()
                .filter(x->!x.isEmpty())// Stream<String>
                .forEach(System.out::println);
        return null;
    }
}
