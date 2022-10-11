package com.revature.collections.exercises;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
public class LinkList {
    public static void main(String[] args) {

        // 1. Write a Java program to append the specified element to the end of a linked list. Add several values.
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("Lexus");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Hyundai");
        System.out.println("Initial List: " + cars);

        cars.addLast("Chevrolet");
        System.out.println(("After addLast(\"Chevrolet\") : " + cars));
        // 2. Write a Java program to iterate through all elements in a linked list.
        System.out.println("==== Iterate over the LinkedList for each element");
        //Iterator<String>
        // 3. Write a Java program to iterate a linked list in reverse order

        // 4.  Write a Java program to insert the specified element at the front of a linked list

        // 5. Write a Java program to insert some elements at the specified position into a linked list.

        // 6. Write a Java program to get the first and last occurrence of the specified elements in a linked list.

        // 7. Write a Java program to check if a particular element exists in a linked list.

        // 8. Write a Java program to convert a linked list to array list.


    }
}
