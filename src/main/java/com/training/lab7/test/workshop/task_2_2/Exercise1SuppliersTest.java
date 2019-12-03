package com.training.lab7.test.workshop.task_2_2;

import com.training.lab7.src.workshop.task_2_2.Supplier;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by olenasyrota on 6/28/16.
 */
public class Exercise1SuppliersTest extends CompanyDomain
{

    @Test
    public void findSupplierNames()
    {
        List<String> supplierNames = Arrays.stream(company.getSuppliers()).map(Supplier::getName).collect(Collectors.toList());


        List<String> expectedSupplierNames = Arrays.asList(
                "Shedtastic",
                "Splendid Crocks",
                "Annoying Pets",
                "Gnomes 'R' Us",
                "Furniture Hamlet",
                "SFD",
                "Doxins");
        Assert.assertEquals(expectedSupplierNames, supplierNames);
    }

    /**
     * entry point is company.
     * Create a {@link Predicate} for Suppliers that supply more than 2 items. Find the number of suppliers that
     * satisfy that Predicate.
     */
    @Test
    public void countSuppliersWithMoreThanTwoItems()
    {
        Predicate<Supplier> moreThanTwoItems = (Supplier x) -> x.getItemNames().length > 2;
        int suppliersWithMoreThanTwoItems = (int) Arrays.stream(company.getSuppliers()).filter(moreThanTwoItems).count();
        Assert.assertEquals("suppliers with more than 2 items", 5, suppliersWithMoreThanTwoItems);
    }

}