package com.revature.oop.inheritance;

public class Bird  extends Animal{ // This extension is where the actual inheritance happens

    // We don't have any fields exclusive to birds
    boolean hasTalons;

    public Bird(boolean hasTalons){
        // super();
        // Where is super here? It's implicit.
        this.hasTalons = hasTalons;
    }

    public Bird(String name, int age, String voice, boolean hasTalons){
        super(name, age, voice); // <-- this super line calls the constructor of the parent class
        this.hasTalons = hasTalons;

    }

    public void move(int distance){
        System.out.println("The bird flew " + distance + " feet!");
    }
}
