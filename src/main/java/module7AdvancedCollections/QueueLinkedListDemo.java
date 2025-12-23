package module7AdvancedCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListDemo {

    /*
     * Queue (LinkedList implementation):
     * - Follows FIFO (First In First Out)
     * - Allows duplicate elements
     * - Used for task scheduling, buffering
     */

    public static void main(String[] args) {

        // Creating Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements
        queue.offer("Task 1");
        queue.offer("Task 2");
        queue.offer("Task 3");

        // Traversing
        System.out.println("Traversing Queue:");
        for (String task : queue) {
            System.out.println(task);
        }

        // Removing element (head)
        System.out.println("Removed: " + queue.poll());

        // Additional methods
        System.out.println("Peek (head): " + queue.peek());
        System.out.println("Size: " + queue.size());
        System.out.println("Is empty? " + queue.isEmpty());
    }
}

