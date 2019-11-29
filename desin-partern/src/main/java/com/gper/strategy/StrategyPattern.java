package com.gper.strategy;

public class StrategyPattern {

    public static void main(String[] args) {

        BillingStrategy normalStrategy = BillingStrategy.normalStrategy();
        BillingStrategy happyStrategy = BillingStrategy.happyStrategy();


        Customer firstCustomer = new Customer(normalStrategy);
        firstCustomer.add(100, 1);
        firstCustomer.setBillingStrategy(happyStrategy);
        firstCustomer.add(100, 2);
        Customer secondCustomer = new Customer(happyStrategy);
        secondCustomer.add(80, 1);
        firstCustomer.printBill();
        secondCustomer.setBillingStrategy(normalStrategy);
        secondCustomer.add(130, 2);
        secondCustomer.add(250, 1);
        secondCustomer.printBill();
    }
}
