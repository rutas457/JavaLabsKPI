package com.training.lab7.test.workshop.task_1_1;


import com.training.lab7.src.workshop.task_1_1.AbbrivationBuilder;
import org.junit.Test;
import org.testng.AssertJUnit;

import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;


/**
 * Created by olenasyrota on 6/28/16.
 */
public class AbbrivationBuilderTest {


    @Test
    public void build_AllParametersNotNull() {
        List<String> list = Arrays.asList("Name", "Petronomics", "Surname");
        AssertJUnit.assertEquals("NPS", AbbrivationBuilder.build(list));
    }

    @Test
    public void build_OneOfParametersIsNull() throws Exception {
        List<String> list = Arrays.asList("Name", null, "Surname");
        assertEquals("NS", AbbrivationBuilder.build(list));
    }

    @Test
    public void build_OneOfParametersIsEmptyString() throws Exception {
        List<String> list = Arrays.asList("Name", "", "Surname");
        assertEquals("NS", AbbrivationBuilder.build(list));
    }
}