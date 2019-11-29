package com.gper.delegate;

public class Employee implements Task {

    @Override
    public void execute() {
        System.out.println("我在加密");
    }

}
