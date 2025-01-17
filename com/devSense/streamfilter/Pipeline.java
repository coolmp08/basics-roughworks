package com.devSense.streamfilter;

import java.util.Arrays;
import java.util.List;

public class Pipeline {

    public static void main(String[] args){

        List<Transaction> transactions = Arrays.asList(
                new Transaction("Groceries",100),
                new Transaction("Entertainment", 1000),
                new Transaction("Groceries", 450),
                new Transaction("Groceries", 240),
                new Transaction("Groceries", 5000),
                new Transaction("Entertainment", 1000),
                new Transaction("Groceries", 490),
                new Transaction("Entertainment", 1000)
        );

        int groceryExpense = transactions.stream()
                .filter(c->c.getCategory().equalsIgnoreCase("Groceries"))
                .mapToInt(Transaction::getAmount)
                .sum();

        System.out.println("Grocery spends: "+ groceryExpense);


        double avgSpend = transactions.stream()
                .mapToDouble(Transaction::getAmount)
                .average().orElse(0.0);

        System.out.println("Average spends: "+ avgSpend);

    }
}

class Transaction{

    String category;
    Integer amount;

    public Transaction() {
    }

    public Transaction(String category, Integer amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
