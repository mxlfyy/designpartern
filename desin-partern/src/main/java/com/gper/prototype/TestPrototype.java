package com.gper.prototype;
import com.gper.prototype.model.Dasheng;
import com.gper.prototype.model.Jingubang;

import java.util.Date;

public class TestPrototype {

    public static void main(String[] args) {

        Dasheng dasheng = new Dasheng(new Jingubang(10, 20));
        dasheng.setBirthDay(new Date());
        dasheng.setName("abc");
        dasheng.setAge(1);

        Dasheng sunwukong = dasheng.shallowClone();

        System.out.println(dasheng.getJingubang() == sunwukong.getJingubang());
        System.out.println(dasheng.getBirthDay() == sunwukong.getBirthDay());
        System.out.println(dasheng.getName() == sunwukong.getName());

        Dasheng sunxingzhe = dasheng.deepClone();
        System.out.println(dasheng.getJingubang() == sunxingzhe.getJingubang());
        System.out.println(dasheng.getBirthDay() == sunxingzhe.getBirthDay());
        System.out.println(dasheng.getName() == sunxingzhe.getName());
    }
}
