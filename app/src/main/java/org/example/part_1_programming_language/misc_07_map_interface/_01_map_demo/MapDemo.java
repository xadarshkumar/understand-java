package org.example.part_1_programming_language.misc_07_map_interface._01_map_demo;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        // HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        // Insert
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        // Print
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");


        // LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        // Insert
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);

        // Get
        System.out.println("The age for " + "Lewis is " + linkedHashMap.get("Lewis"));

        // Print
        System.out.println("Display entries in LinkedHashMap");
        System.out.println(linkedHashMap + "\n");


        // TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        System.out.println();
        treeMap.forEach((name, age) -> System.out.println(name + ": " + age));
        // (name, age) −> System.out.print(name + ": " + age + " "));
    }
}
