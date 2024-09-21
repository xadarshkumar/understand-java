package org.example.part_1_programming_language.misc_06_queue_deque_interface._01_queue_demo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // Insert
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");

        // Examine - returns 1st removable element
        System.out.println(queue.peek());
        System.out.println(queue.peek());

        // remove
        while (!queue.isEmpty())
            System.out.print(queue.remove() + " ");
    }
}
