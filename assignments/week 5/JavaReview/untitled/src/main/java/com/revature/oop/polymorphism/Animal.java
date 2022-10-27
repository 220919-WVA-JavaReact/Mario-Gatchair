package com.revature.oop.polymorphism;

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

    public Animal(int age, String voice){
        this.age = age;
        this.voice = voice;
        this.name = "rex";
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        this.voice = "No voice provided";
    }

// public Animal(int age, String name){
//   this.name = name;
//   this.age = age;
//   this.voice = "No voice provided";
// }

    public void move (int distance){
        System.out.println("The animal moved a distance of " + distance + " feet!");
    }

    public void speak(){
        System.out.println("Nothing yet provided");
    }
}
