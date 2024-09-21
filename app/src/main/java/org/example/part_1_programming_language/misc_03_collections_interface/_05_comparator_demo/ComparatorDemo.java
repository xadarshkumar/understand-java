package org.example.part_1_programming_language.misc_03_collections_interface._05_comparator_demo;

import java.util.Arrays;
import java.util.Comparator;


/*
 * Sometimes a class implements the Comparable interface,
 * but if you would like to compare their objects using a different criteria,
 * you can define a custom comparator
 */

// SortStringByLength
public class ComparatorDemo {

    public static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }

    public static void printString(String[] str) {
        for (String s : str) {
            System.out.print(" " + s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] cities1 = {"Atlanta", "Savannah", "New York", "Dallas"};
        Arrays.sort(cities1, new MyComparator());
        printString(cities1);

        // code can also be simplified using lambda expression
        String[] cities2 = {"Atlanta", "Savannah", "New York", "Dallas"};
        Arrays.sort(cities2, (s1, s2) -> s2.length() - s1.length());
        printString(cities2);
    }
}
