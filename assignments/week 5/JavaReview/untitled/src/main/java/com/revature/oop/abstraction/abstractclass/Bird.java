package com.revature.oop.abstraction.abstractclass;

public class Bird extends Animal{
    @Override
    public void speak() {
        System.out.println("Chirp chirp");
    }
    // We can still override the concerte methods available inside


    @Override
    public void move(int distance) {
        System.out.println("the bird flew " + distance + " feet!");
    }

    public Bird (String name, int age, String voice){
    super(name, age, voice);
    }
}
