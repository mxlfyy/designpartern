package com.gper.delegate;

public class Leader {

    public void doWork(String command){
        if("加密".equals(command)){
            new Employee().execute();
        } else {
            new OtherEmployee().execute();
        }
    }
}
