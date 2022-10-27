package com.revature.oop.inheritance;

public class Animal {

    // This will be the parent class for all of our animal classes. So this class defines some of the basic features we
    // expect ALL of our pets to have

    String name; // this denotes anything that is an animal has a name

    int age; // An age

    String voice; // Some voice

    public Animal() {
        this.name = "No name provided";
        this.age = 1;
        this.voice = "No voice provided";
    }

    public Animal(String name, int age, String voice) {
        this.name = name;
        this.age = age;
        this.voice = voice;
    }

    public void move (int distance){}

    public void speak(){
        System.out.println("Nothing yet provided");
    }
}
