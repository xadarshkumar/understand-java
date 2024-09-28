package org.example.part_3_data_structures_and_algorithms._4_hashtable;

public class Main {
    public static void main(String[] args) {
        System.out.println(">>>>> Hash Table <<<<<");
        System.out.println();
        System.out.println("HT Constructor - empty");
        HTConstructor myHT = new HTConstructor();
        myHT.printTable();

        HTOperations ht = new HTOperations();
        System.out.println("HT Set");
        ht.set("nails", 100);
        ht.set("screws", 123);
        ht.set("bolts", 231);
        ht.set("lumber", 421);
        ht.printTable();

        System.out.println("HT Get");
        ht.get("hello");
        ht.get("lumber");
        System.out.println();

        System.out.println("HT All Keys");
        ht.getAllKeys();
    }
}
