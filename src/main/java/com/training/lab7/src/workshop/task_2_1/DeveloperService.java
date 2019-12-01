package com.training.lab7.src.workshop.task_2_1;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by olenasyrota on 6/28/16.
 */
public class DeveloperService {

    public static List<String> getLanguages(List<Developer> team) {
        return team.stream()
                .map(Developer::getLanguages)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
    }
}
