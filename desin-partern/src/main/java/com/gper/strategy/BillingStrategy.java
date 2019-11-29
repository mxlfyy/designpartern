package com.gper.strategy;

@FunctionalInterface
public interface BillingStrategy {

    int getPrice(int rawPrice);

    static BillingStrategy normalStrategy(){
        return rawPrice -> rawPrice;
    }

    static BillingStrategy happyStrategy(){
        return rawPrice -> rawPrice / 2;
    }
}
