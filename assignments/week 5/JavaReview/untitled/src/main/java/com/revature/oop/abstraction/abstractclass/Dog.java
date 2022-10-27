package com.revature.oop.abstraction.abstractclass;

public class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("bark bark");
    }
    @Override
    public Dog (String name, int, age, String voice){
        super(name,age, voice);
    }
}
