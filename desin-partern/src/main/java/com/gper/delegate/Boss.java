package com.gper.delegate;

public class Boss {

    private Leader leader = new Leader();

    public void command(String command){
        leader.doWork(command);
    }
}
