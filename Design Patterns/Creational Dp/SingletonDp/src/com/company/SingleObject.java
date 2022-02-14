package com.company;

public class SingleObject {
    private static SingleObject instance = new SingleObject();


    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("This is from singleton design pattern!");
    }
}
