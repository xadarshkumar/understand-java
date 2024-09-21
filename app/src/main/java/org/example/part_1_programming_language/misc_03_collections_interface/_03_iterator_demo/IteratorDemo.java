package org.example.part_1_programming_language.misc_03_collections_interface._03_iterator_demo;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase() + " ");
        }
        System.out.println();

        // another way
        for(String s: collection)
            System.out.print(s.toLowerCase() + " ");
    }
}
