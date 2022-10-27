package com.revature.oop.encapsulation;

public class Person {

    private String name;

    private int age;

    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{ Name = " + this.name + ", Age = " + this.age + ", Height = " + this.height +"}";
    }

    // What we need to access and change these fields is mutators (aka getters and setters)

    // Getters just retrieve the information available

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    // Now comes the idea of setting the variables.
    // Goal: To protect our variables from invalid data.


    // A name shouldn't be null or a blank string

    public void setName(String name){
        if (name == null || name.length() == 0){
            System.out.println("Invalid name");
            return;
        }
        this.name = name;
    }

    // Age should be positive

    public void setAge(int age) {
        if (age <= 0){
            System.out.println("Invalid Age!");
            return;
        }
        this.age = age;
    }

    // Height should be positive, and maybe you shouldn't be taller than 96 inches (8 feet)

    public void setHeight(double height) {
        if (height > 0 && height <= 84) {
            this.height = height;
            return;
        }
        System.out.println("Invalid Height");
    }
}
