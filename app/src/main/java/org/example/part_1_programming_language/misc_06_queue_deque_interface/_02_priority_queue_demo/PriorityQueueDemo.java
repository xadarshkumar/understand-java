package org.example.part_1_programming_language.misc_06_queue_deque_interface._02_priority_queue_demo;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // KIM: sorted by their natural order
        PriorityQueue<String> queue = new PriorityQueue<>();
        // Insert
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");

        System.out.println("Priority queue using Comparable:");
        while (queue.size() > 0) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();

        // KIM: sorted by an order specified by a Comparator
        PriorityQueue<String> queue2 = new PriorityQueue<>(4, Collections.reverseOrder());
        // Insert
        queue2.offer("Oklahoma");
        queue2.offer("Indiana");
        queue2.offer("Georgia");
        queue2.offer("Texas");

        System.out.println("\nPriority queue using Comparator:");
        while (queue2.size() > 0) {
            System.out.print(queue2.remove() + " ");
        }
    }
}
