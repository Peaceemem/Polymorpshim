package com.peace.poly;

public class Animal {
    private String name;
    //This is a behaviour called makeSound
    // method overloading
    public void makeSound(){
        System.out.println("May GOD help me learn this course very well");
    }
    public void makeSound(String soundType){
        System.out.println(soundType);
    }
    public void makeSound(String soundType, String loudness){
        System.out.println(soundType + ", loudness is " + loudness);
    }

}
