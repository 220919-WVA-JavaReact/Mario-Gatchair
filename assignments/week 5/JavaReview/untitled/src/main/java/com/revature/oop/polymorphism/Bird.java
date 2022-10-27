package com.revature.oop.polymorphism;

public class Bird extends Animal{


    @Override
    public void move(int distance){
        System.out.println("The dog moved a distance of " + distance + " feet!");
    }

    public Bird(String name, int age, String voice) {
        super(name, age, voice);
    }
}
