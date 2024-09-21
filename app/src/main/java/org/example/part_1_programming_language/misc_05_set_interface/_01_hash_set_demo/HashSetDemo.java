package org.example.part_1_programming_language.misc_05_set_interface._01_hash_set_demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void printSet(Set<String> stringSet) {
        for (String s : stringSet)
            System.out.print(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // Insert
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("New York");
        printSet(set);

        System.out.println(set.size() + " elements in set");
    }
}
