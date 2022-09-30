package com.revature.calculator;
import java.util.Scanner;

public class CalculatorDriver {
    //Goal: We want to create some sort of console application that allows us to take input for a calculator
    public static void main(String[] args) {
        // defining input
        char operator;
        Double number1, number2, result;

        // creating an object for the Scanner import
        Scanner input = new Scanner(System.in);


        // getting the desired execution
        System.out.println("Choose an operation: 'add', 'sub', 'multiply', or 'divide'");

        String operation = input.nextLine();
        operator = input.next().charAt(0);

        // asking for numbers
        System.out.println("Enter your first number");
        number1 = input.nextDouble();

        System.out.println("Enter your second number");
        number2 = input.nextDouble();

        if (operation.equals("add") );
    }
}