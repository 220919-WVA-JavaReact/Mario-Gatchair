package com.revature.testing;

public class ArraySum {

    /*
    Below is the static method arraySum() it takes in an array of integers and returns the sum
     */

    public static int arraySum(int[] a){

        // This is where your code goes
        int sum = 0;
        for(int i:a){
            sum+= i;
        }


        return sum;
    }
}