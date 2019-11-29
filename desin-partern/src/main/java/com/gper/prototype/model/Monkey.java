package com.gper.prototype.model;

import java.io.Serializable;
import java.util.Date;

public class Monkey implements Serializable {

    public Date birthDay;

    public int age;

    public String name;

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
