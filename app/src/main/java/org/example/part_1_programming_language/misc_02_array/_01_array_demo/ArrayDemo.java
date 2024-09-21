package org.example.part_1_programming_language.misc_02_array._01_array_demo;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] myArray; // Declaration
        myArray = new int[5]; // Instantiation
        myArray[0] = 1; // Initialization
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;

        //traversing array
        System.out.print("myArray:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(" " + myArray[i]);
        }
        System.out.println();

        //traversing array
        int[] anotherArray = {11, 12, 13, 14, 15}; //declaration, instantiation and initialization
        System.out.print("anotherArray:");
        for (int item : anotherArray) {
            System.out.print(" " + item);
        }
        System.out.println();
    }
}
