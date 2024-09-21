package org.example.part_1_programming_language.misc_03_collections_interface._04_comparable_demo;

import java.util.Arrays;

// SortComparableObjects
public class ComparableDemo {
    public static void printString(String[] str) {
        for (String s : str)
            System.out.print(" " + s);

        System.out.println();
    }

    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        Arrays.sort(cities);
        printString(cities);
    }
}
