package com.revature.oop.polymorphism;

public class Dog extends Animal{

    public Dog(String name, int age, String voice){
        super(name, age, voice);
    }

    @Override
    public void move(int distance){
        System.out.println("The dog moved a distance of " + distance + " feet!");
    }

    @Override
    public void speak(){
        System.out.println("Woof Woof!");
    }
}
