package com.revature.oop.polymorphism;

public class Driver {

    public static void main(String[] args){
        Bird randall = new Bird("Randall", 17, "chirp");

        randall.move(13);

        Dog sadie = new Dog("Sadie", 11, "Woof");

        sadie.move(10);

        randall.speak();
        sadie.speak();

        Cat cat = new Cat();
    }
}
