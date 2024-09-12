package org.example.part_1_programming_language.misc_04_array;

public class MultiDimensionalArrayDemo {
    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] myMatrix; // Declaration
        myMatrix = new int[2][4]; // Instantiation
        myMatrix[0][0] = 0; // Initialization
        myMatrix[0][1] = 1;
        myMatrix[0][2] = 2;
        myMatrix[0][3] = 3;
        myMatrix[1][0] = 4;
        myMatrix[1][1] = 5;
        myMatrix[1][2] = 6;
        myMatrix[1][3] = 7;

        print(myMatrix);
    }
}
