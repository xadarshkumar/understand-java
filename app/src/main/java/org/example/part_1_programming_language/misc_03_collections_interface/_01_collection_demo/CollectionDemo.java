package org.example.part_1_programming_language.misc_03_collections_interface._01_collection_demo;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        // collection1
        ArrayList<String> collection1 = new ArrayList<>();
        // add
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        System.out.println("A list of cities in collection1:");
        System.out.println(collection1);

        // contains
        System.out.println("\nIs Dallas in collection1? " + collection1.contains("Dallas"));

        // remove
        collection1.remove("Dallas");

        // size
        System.out.println("\n" + collection1.size() + " cities are in collection1 now");

        // collection2
        Collection<String> collection2 = new ArrayList<>();
        // add
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.println("\nA list of cities in collection2:");
        System.out.println(collection2);

        // clone
        ArrayList<String> c1 = (ArrayList<String>) (collection1.clone());
        // addAll
        c1.addAll(collection2);

        System.out.println("\nCities in collection1 or collection2: ");
        System.out.println(c1);

        c1 = (ArrayList<String>) (collection1.clone());
        c1.retainAll(collection2);
        System.out.print("\nCities in collection1 and collection2: ");
        System.out.println(c1);

        c1 = (ArrayList<String>) (collection1.clone());
        c1.removeAll(collection2);

        System.out.print("\nCities in collection1, but not in 2: ");
        System.out.println(c1);
    }
}
