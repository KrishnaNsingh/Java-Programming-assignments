package LabUnit9;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a vector with an initial capacity of 3
        Vector<String> vec = new Vector<>(3);

        // Adding elements
        vec.add("Java");
        vec.add("Python");
        vec.add("C++");
        vec.add("JavaScript"); // Capacity will automatically increase

        System.out.println("Vector size: " + vec.size());
        System.out.println("Vector capacity: " + vec.capacity());

        // Accessing elements
        System.out.println("First element: " + vec.firstElement());
        
        // Check if element exists
        if (vec.contains("Python")) {
            System.out.println("Python is in the vector.");
        }

        // Removing an element
        vec.remove("C++");

        // Display all elements
        System.out.println("Current Vector: " + vec);
    }
}
