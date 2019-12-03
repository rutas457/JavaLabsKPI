package com.training.lab8;

public class Account {
    private int balance;
    private String name;
    private final int id;
    private boolean isBlocked;
    public Account(String name, int id) {
        this.name = name;
        this.id = id;
        isBlocked = false;
    }

    public boolean deposit(int amount) {
        balance+=amount;
        return true;
    }

    public boolean withdraw(int amount) {
        if(balance >= amount) {
            balance-=amount;
            return true;
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void block() {
        isBlocked = true;
    }

    public int getId() {
        return id;
    }
}
