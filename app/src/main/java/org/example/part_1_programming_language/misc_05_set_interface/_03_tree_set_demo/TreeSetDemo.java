package org.example.part_1_programming_language.misc_05_set_interface._03_tree_set_demo;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void printSet(Set<String> stringSet) {
        for (String s : stringSet)
            System.out.print(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        NavigableSet<String> treeSet = new TreeSet<>();
        // Insert
        treeSet.add("London");
        treeSet.add("Paris");
        treeSet.add("New York");
        treeSet.add("San Francisco");
        treeSet.add("New York");
        treeSet.add("Beijing");
        printSet(treeSet);

        System.out.println(treeSet.size() + " elements in set");
        System.out.println();

        // methods in SortedSet interface
        System.out.println("methods in SortedSet interface");
        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());
        System.out.println("headSet(\"New York\"): " + treeSet.headSet("New York"));
        System.out.println("tailSet(\"New York\"): " + treeSet.tailSet("New York"));
        System.out.println();

        // methods in NavigableSet interface
        System.out.println("methods in NavigableSet interface");
        System.out.println("lower(\"P\"): " + treeSet.lower("P"));
        System.out.println("higher(\"P\"): " + treeSet.higher("P"));
        System.out.println("floor(\"P\"): " + treeSet.floor("P"));
        System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("New tree set: " + treeSet);
    }
}
