package com.gper.strategy;

import java.util.ArrayList;

public class Customer {

    private final ArrayList<Integer> drinks = new ArrayList<>();
    private BillingStrategy billingStrategy;

    public Customer(BillingStrategy billingStrategy){
        this.billingStrategy = billingStrategy;
    }

    public BillingStrategy getBillingStrategy() {
        return billingStrategy;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public void add(int price, int quantity){
        this.drinks.add(this.billingStrategy.getPrice(price * quantity));
    }

    public void printBill(){
        int sum = this.drinks.stream().mapToInt(value -> value * 1).sum();
        System.out.println(String.format("the total is %d", sum));
    }
}
