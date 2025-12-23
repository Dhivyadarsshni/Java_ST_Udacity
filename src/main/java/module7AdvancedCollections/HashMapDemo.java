package module7AdvancedCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    /*
     * HashMap:
     * - Stores data in key-value pairs
     * - Keys are unique, values can be duplicate
     * - No insertion order maintained
     * - Allows one null key and multiple null values
     */

    public static void main(String[] args) {

        // Creating HashMap
        Map<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        // Traversing using entrySet
        System.out.println("Traversing HashMap:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Removing entry
        students.remove(102);

        // Additional methods
        System.out.println("Get value for key 101: " + students.get(101));
        System.out.println("Contains key 103? " + students.containsKey(103));
        System.out.println("Contains value Alice? " + students.containsValue("Alice"));
        System.out.println("Size: " + students.size());
    }
}

