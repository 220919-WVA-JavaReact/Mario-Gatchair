package com.revature.calculator;
import java.util.Scanner;

public class Calculator {
    //Goal: We want to create some sort of console application that allows us to take input for a calculator
    public static void main(String[] args) {
        // defining input

        Double number1, number2, result;

        // creating an object for the Scanner import
        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("Let's get started");

        String operation;

        while (running) {
            // getting the desired execution
            System.out.println("Choose an operation: 'add' to add, 'sub' to sub, 'multiply' to multiply, 'divide' to divide or 'exit' to quit");

            operation = input.nextLine();
            while (!operation.equals("add") && !operation.equals("sub") && !operation.equals("multiply") && !operation.equals("divide") && !operation.equals("exit")) {
                System.out.println("Invalid input");
                operation = input.nextLine();
            }
            if (operation.equals("exit")) {
                System.out.println("Ending program!");
                break;
            }
            // asking for numbers
            System.out.println("Enter your first number");
            number1 = input.nextDouble();

            System.out.println("Enter your second number");
            number2 = input.nextDouble();

            // if they want to do addition
            if (operation.equals("add")){
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                //if they want to do subtraction
            } else if (operation.equals("sub")){
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
            } else if (operation.equals("multiply")){
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
            } else if (operation.equals("divide")){
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
            }
            input.nextLine();
        }
    }
}
