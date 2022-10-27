package com.revature.oop.abstraction.interfaces;

public class Bike implements Vehicle{

    int speed = 0;

    //We have to override the abstract methods because we've entered into a contract with our vehicle interface
    @Override
    public void speedUp(int increment) {
        System.out.println("Bicycle speeds up");
        speed += increment;
        // speed is equal to speed + increment
    }

    @Override
    public void slowDown(int decrement) {
        System.out.println("Bicycle slows down");
        speed -= decrement;
        // speed is equal to speed - decrement
    }
}
