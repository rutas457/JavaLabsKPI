package com.training.lab7.src.workshop.task_1_1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by olenasyrota on 6/28/16.
 */
public class AbbrivationBuilder {


    public static String build(List<String> list) {
        return list.stream()
                .filter(x -> x != null && !x.isEmpty())
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .map(x -> (x.charAt(0)))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

}
