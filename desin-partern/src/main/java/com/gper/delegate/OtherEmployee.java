package com.gper.delegate;

public class OtherEmployee implements Task {
    @Override
    public void execute() {
        System.out.println("其他任务");
    }
}
