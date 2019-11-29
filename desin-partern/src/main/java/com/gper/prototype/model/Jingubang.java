package com.gper.prototype.model;

import java.io.Serializable;

public class Jingubang implements Serializable {

    private int height;

    private int length;

    public Jingubang(){

    }

    public Jingubang(int height, int length){
        this.height = height;
        this.length = length;
    }

    public void bigger(){
        this.height = this.height * 2;
        this.height = this.length * 2;
    }

    public void smaller(){
        this.height = this.height/2;
        this.length = this.length/2;
    }
}
