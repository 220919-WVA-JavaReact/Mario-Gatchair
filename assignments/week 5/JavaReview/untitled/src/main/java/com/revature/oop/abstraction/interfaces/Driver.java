package com.revature.oop.abstraction.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args){
        /*
        This idea of abstraction basically allows us to call upon our contract and have guaranteed implementations for our
        methods no matter what
         */

        Vehicle vehicle = new Bike();

        vehicle.speedUp(12);

        // We can directly change the implementation of this vehicle by swapping it out for something else that accepts our contract
        vehicle = new Bicycle();

        vehicle.speedUp(13);
        List<Integer> nums = new ArrayList<>();
        // Interface = new implementing class
    }
}
