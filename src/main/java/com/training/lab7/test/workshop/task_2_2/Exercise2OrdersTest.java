package com.training.lab7.test.workshop.task_2_2;

import com.training.lab7.src.workshop.task_2_2.Customer;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by olenasyrota on 6/28/16.
 */
public class Exercise2OrdersTest extends CompanyDomain
{
    /**
     *  Aggregate the total order values by city.
     */
    @Test
    public void totalOrderValuesByCity()
    {

        Map<String, Double> map = new HashMap<>();
        company.getCustomers().stream().forEach(x -> {
            map.merge(x.getCity(), x.getTotalOrderValue(), (oldOrder, newOrder) -> oldOrder + newOrder);
        });
        assertEquals(2, map.size());
        assertEquals(446.25, map.get("London"), 0.0);
        assertEquals(857.0, map.get("Liphook"), 0.0);
    }

    /**
     * Extra credit. Create a map where the values are customers and the key is the price of
     * the most expensive item that the customer ordered.
     */

    @Test
    public void mostExpensiveItem()
    {
        Map<Double, List<Customer>> map = new HashMap<>();
        company.getCustomers().forEach(x -> {
            map.merge(x.getMostExpensiveItemValue(), Collections.singletonList(x), (oldCustomers, newCustomer) -> {
                ArrayList<Customer> resArrayList = new ArrayList<>(oldCustomers);
                resArrayList.addAll(newCustomer);
                return resArrayList;
            });
        });
        Assert.assertEquals(2, map.size());
        Assert.assertEquals(2, map.entrySet().size());
        Assert.assertEquals(
                Arrays.asList(
                        this.company.getCustomerNamed("Fred"),
                        this.company.getCustomerNamed("Bill")),
                map.get(50.0));
    }



}
