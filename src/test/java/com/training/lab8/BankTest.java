package com.training.lab8;

import org.junit.*;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.Assert.*;

public class BankTest {
    Bank bank;
    int accountsCount = (int) (Math.random()*2500), threadsCount = 5000 + (int) (Math.random()*10000),
            transactionCount = 100000 + ((int) Math.random()*25000);
    ExecutorService executorService = Executors.newFixedThreadPool(threadsCount);
    @Before
    public void setUp() throws Exception {

        bank = new Bank("MMM");
        for(int i = 0; i < accountsCount; i++)
            bank.addAccount(new Account("Bob", bank.getLastId()));
        bank.getAccounts().stream().forEach(x -> x.deposit((int) (Math.random()*1000)));
    }

    @After
    public void tearDown() throws Exception {
        bank = null;
    }

    private ArrayList<Future> refresh() {
        ArrayList<Future> futures = new ArrayList<>();
        for(int i = 0; i < transactionCount; i++) {
            int fromId = (int) (Math.random()*accountsCount);
            int toIdTemp;
            while ((toIdTemp = (int) (Math.random()*accountsCount)) == fromId);
            int toId = toIdTemp;
            futures.add(executorService.submit(() -> {
                bank.transfer(bank.getAccounts().get(fromId), bank.getAccounts().get(toId), (int)(Math.random()*10000));
            }));
        }
        return futures;
    }

    @Test
    public void testTotalBalanceEquals() throws InterruptedException, ExecutionException {
        for (int i = 0; i < 10; i++) {
            long prev = bank.getTotalBalance();

            for (Future future : refresh())
                future.get();
            if(prev != bank.getTotalBalance()) {
                System.out.println("Fail! " + prev + " " + bank.getTotalBalance());
                return;
            }
        }

        System.out.println(bank.getTotalBalance() + " OK :)");
    }
}