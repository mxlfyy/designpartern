package com.gper.prototype.model;

import java.io.*;

public class Dasheng extends Monkey implements Serializable {

    private Jingubang jingubang;

    public Dasheng(){

    }

    public Dasheng(Jingubang jingubang){
        this.jingubang = jingubang;
    }

    public Jingubang getJingubang() {
        return jingubang;
    }

    public void setJingubang(Jingubang jingubang) {
        this.jingubang = jingubang;
    }

    public Dasheng deepClone(){
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        try{
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            objectInputStream = new ObjectInputStream(inputStream);
            Dasheng dasheng = (Dasheng) objectInputStream.readObject();
            return dasheng;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Dasheng shallowClone(){
        Dasheng dasheng = new Dasheng();

        dasheng.setJingubang(this.jingubang);
        dasheng.setAge(this.age);
        dasheng.setBirthDay(this.birthDay);
        dasheng.setName(this.name);
        return dasheng;
    }

}
