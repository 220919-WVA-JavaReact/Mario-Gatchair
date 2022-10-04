package com.revature.collections.exercises;
import java.util.Iterator;
import java.util.ArrayList;


public class ArryList {

    public static void main(String[] args) {
        // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

        ArrayList<String> colors =  new ArrayList<String>();
        colors.add("Scarlet");
        colors.add("Fuchsia");
        colors.add("Teal");
        colors.add("Navy");
        colors.add("Black");
        colors.add("Violet");
        System.out.println(colors);
        System.out.println("+--------------+");


        // 2. Write a Java program to iterate through all elements in an array list
        Iterator<String> cl = colors.iterator();
        while (cl.hasNext()){
            System.out.println(cl.next());
        }
        System.out.println("+---------------+");

        // 3. Write a Java program to insert an element into the array list at the first position
        colors.add(0, "Lilac");
        colors.add(6,"Powder Blue");
        System.out.println(colors);
        System.out.println("+---------------+");
        // 4. Write a Java program to retrieve an element (at a specified index) from a given array list
        String color = colors.get(3);
        String cll = colors.get(0);
        String co = colors.get(2);
        System.out.println("Color 1 is: " + cll);
        System.out.println("Color 3 is: " + co);
        System.out.println("Color 4 is: " + color);
        System.out.println("+---------------+");
        // 5. Write a Java program to remove the third element from an array list.
        colors.remove(6);
        System.out.println("After remove(6): " + colors);
        // 6. Write a Java program to search an element in an array list.
        
        // 7. Write a Java program to sort a given array list.
    }
}
