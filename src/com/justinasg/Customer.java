package com.justinasg;

import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransactions(Double transaction) {
        this.transactions = new ArrayList<>();
        transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void createNewCustomer(String name, Double transaction){
        setName(name);
        setTransactions(transaction);
    }
}
