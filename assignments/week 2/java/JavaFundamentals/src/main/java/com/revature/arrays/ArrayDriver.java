package com.revature.arrays;

import java.util.Arrays;

public class ArrayDriver {

    public static void main(String[] args) {
        // declares an array of integers
        //int[] anArray;

        //allocates memory for 10 integers
        //anArray = new int[10];

        //initialize first element
        //anArray[0] = 100;
        //initialize second element
        //anArray[1] = 200;
        // and so forth
        //anArray[2] = 300;
        //anArray[3] = 400;
        //anArray[4] = 500;
        //anArray[5] = 600;
        //anArray[6] = 700;
        //anArray[7] = 800;
        //anArray[8] = 900;
        //anArray[9] = 1000;

        //System.out.println("Element at index 0: " + anArray[0]);
        //System.out.println("Element at index 1: " + anArray[1]);
        //System.out.println("Element at index 2: " + anArray[2]);
        //System.out.println("Element at index 3: " + anArray[3]);
        //System.out.println("Element at index 4: " + anArray[4]);
        //System.out.println("Element at index 5: " + anArray[5]);
        //System.out.println("Element at index 6: " + anArray[6]);
        //System.out.println("Element at index 7: " + anArray[7]);
        //System.out.println("Element at index 8: " + anArray[8]);
        //System.out.println("Element at index 9: " + anArray[9]);

        //delcare an array of integers
        int[] myNumArray = new int[10];

        System.out.println(Arrays.toString(myNumArray));

        //System.out.println(myNumArray.toString());

        int[] myArray = {1,2,3,4,5};

        System.out.println(Arrays.toString(myArray));

        // How would I go about adding up every number in this array?

        double balance = 0;

        double[] transactions = {1000, -119.99, 40, -35.43, -150.65};

        // How do I find the current balance of my account?

        // I'd have to find the sum of the values in this array

        for (int i = 0; i < transactions.length; i++){
            balance += transactions[i];
        }

        System.out.println("Balance: " + balance);

        for (int i = 0; i < transactions.length; i++){
            balance += transactions[i];
            System.out.println(transactions[i]);
        }
        // Sort this array?

        char[] sizesOfShirts = {'S', 'M', 'L', 'X', 'T'};

        int[] sizesAsNumbers = {2,3,4,2,4,5,1};

        Arrays.sort(sizesAsNumbers);

        System.out.println(Arrays.toString(sizesAsNumbers));

    }
}
