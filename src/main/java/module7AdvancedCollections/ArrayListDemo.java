package module7AdvancedCollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    /*
     * ArrayList:
     * - Part of List interface
     * - Allows duplicate elements
     * - Maintains insertion order
     * - Dynamic array (resizable)
     */

    public static void main(String[] args) {

        // Creating ArrayList
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicates allowed

        // Traversing using for-each loop
        System.out.println("Traversing ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing element
        fruits.remove("Banana");

        // Additional methods
        System.out.println("Size: " + fruits.size());
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println("Element at index 1: " + fruits.get(1));

        // Clearing all elements
        fruits.clear();
        System.out.println("Is list empty? " + fruits.isEmpty());
    }
}
