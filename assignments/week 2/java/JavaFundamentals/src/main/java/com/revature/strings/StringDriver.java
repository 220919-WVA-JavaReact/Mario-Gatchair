package com.revature.strings;

public class StringDriver {

    public static void main(String[] args) {
        /*
        We saw yesterday one of the various methods associated with strings: string.length()
        Today we'll talk a bit more about strings and about how they're stored, equality, and some methods associated
         */

        String text = "This is a String";

        // We mentioned that Strings were objects but when created our person object earlier we had to some funky stuff
        // by say "new Person(arguments)"

        // Strings can also be created like so

        String text2 = new String("This is also a string");

        // Let's start adding strings together and see what happens

        String helloWorld = "Hello";

        // Let's add onto this original string

        helloWorld += " world";

        System.out.println(helloWorld);

        // Java is pass by value not pass by reference so if I tried something like

        addOn(helloWorld);

        System.out.println(helloWorld);

        // If I wanted the value to be updated I would have to store it in the variable itself

        helloWorld = addOn(helloWorld);

        System.out.println(helloWorld);

        String s1 = "Apple";

        String s2 = "Mango";

        String s3 = "Apple";

        // If I want to test the equality of these I'll my == operator from yesterday

        System.out.println(s1 == s2);

        System.out.println(s1 == s3);

        // Now what happens if I create a String object with the new keyword and test the equality?

        String s4 = new String("Mango");

        System.out.println(s2 == s4);

        // When working with objects we see that the == operator actually checks the objects to see if they're the same
        // object IN MEMORY, it does not check the explicit value but checks the "address" of the data

        // So how do we check for equality of values? What we need to call instead is the .equals() method. The .equals()
        // method comes from the Object class, which all classes inherit from (more on this later) but it essentially allows
        // us the ability to check the equality of different objects based off value. (Provided that we override .equals
        // more on this later)

        System.out.println(s2.equals(s4));

        // This idea of using the .equals for objects is very important and we'll discuss it again later when looking at
        // inheritance and polymorphism

        // Let's look at some useful methods that belong to the string class before we run to lunch

        // Let's say I wanted to find a string's length

        String newString = "This is a string";

        System.out.println(newString.length());

        System.out.println(isEven(newString));

        // What happens if maybe we wanted to repeat string so many times

        newString.repeat(2);

        System.out.println(newString.repeat(5));

        // I'm going to call my count repeat method

        System.out.println(repeatSpace(newString, 5));
    }

    public static String addOn(String text){
        return text + " Adding onto the end";
    }

    // Let's make a quick method to check and see if the length of a string is even
    public static boolean isEven(String text){
        // Steps here are to find the length of the string
        // Then we check if it is even

        // I'm going to store the length of the string in a variable
        int len = text.length();

        // Now how to check if a number is even?
        // There's a couple ways we can do this but the easiest is the modulus operator

        if (len % 2 == 0){
            return true;
        } else{
            return false;
        }
    }

    // Let's create a quick method for repeating strings with a space in the middle
    public static String repeatSpace(String text, int count){

        // I can't just return the string.repeat(count)

        // The space makes things more complicated, I could use a for loop or I could try to use repeat

        // For loop
        // First let's create a blank string object to store our info
        String newText = "";
        for (int i = 0; i < count; i++){
            newText += text;
            newText += " ";
        }

        // This isn't *exactly* correct since it has a space at the end but we'll see how it works
        return newText;
    }
}
