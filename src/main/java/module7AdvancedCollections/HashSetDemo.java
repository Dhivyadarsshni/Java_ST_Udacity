package module7AdvancedCollections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    /*
     * HashSet:
     * - Part of Set interface
     * - Does NOT allow duplicates
     * - No insertion order maintained
     * - Faster operations (uses hashing)
     */

    public static void main(String[] args) {

        // Creating HashSet
        Set<Integer> numbers = new HashSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // duplicate ignored

        // Traversing
        System.out.println("Traversing HashSet:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Removing element
        numbers.remove(20);

        // Additional methods
        System.out.println("Size: " + numbers.size());
        System.out.println("Contains 30? " + numbers.contains(30));
        System.out.println("Is empty? " + numbers.isEmpty());
    }
}

