package org.example.part_1_programming_language.misc_03_collections_interface._02_iterable_demo;

import java.util.ArrayList;
import java.util.Collection;

public class IterableDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        // using a lambda expression
        collection.forEach(e -> System.out.print(e.toUpperCase() + " "));
        System.out.println();

        // using an anonymous inner class
        collection.forEach(
            new java.util.function.Consumer<String>() {
                public void accept(String e) {
                    System.out.print(e.toUpperCase() + " ");
                }
            }
        );
    }
}
