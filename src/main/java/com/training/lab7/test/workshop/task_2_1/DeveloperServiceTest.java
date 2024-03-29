package com.training.lab7.test.workshop.task_2_1;

import com.training.lab7.src.workshop.task_2_1.Developer;
import com.training.lab7.src.workshop.task_2_1.DeveloperService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by olenasyrota on 6/28/16.
 */
public class DeveloperServiceTest {


    @Test
    public void getLanguages() {
        List<Developer> team = new ArrayList<>();
        Developer polyglot = new Developer("esoteric");
        polyglot.add("clojure");
        polyglot.add("scala");
        polyglot.add("groovy");
        polyglot.add("go");

        Developer busy = new Developer("pragmatic");
        busy.add("java");
        busy.add("javascript");

        team.add(polyglot);
        team.add(busy);

        List<String> teamLanguages = DeveloperService.getLanguages(team);

        assertTrue(teamLanguages.containsAll(polyglot.getLanguages()));
        assertTrue(teamLanguages.containsAll(busy.getLanguages()));
    }
}