package com.peace.poly;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal{
    private String name;
    public void move(){
        System.out.println("Move!");
    }
    //overriding method
    public void makeSound(){
        System.out.println("vera ");
    }
    public void makeSound(String soundType) {
        System.out.println(soundType);
    }
}
