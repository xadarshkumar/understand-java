package org.example.part_4_practice._2024_09_25_mercedes_benz_india;

/*
 * elements of matrix should be multiple of 5
 */
public class P1 {
    public static void printUpdated(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int a;
                int rem = matrix[i][j] % 5;
                if (rem == 0) {
                    a = matrix[i][j];
                } else {
                    a = matrix[i][j] + (5 - rem);
                }
                System.out.print(" " + a);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] myMatrix; // Declaration
        myMatrix = new int[2][2]; // Instantiation
        myMatrix[0][0] = 1; // Initialization
        myMatrix[0][1] = 7;
        myMatrix[1][0] = 13;
        myMatrix[1][1] = 22;

        printUpdated(myMatrix);
    }
}
