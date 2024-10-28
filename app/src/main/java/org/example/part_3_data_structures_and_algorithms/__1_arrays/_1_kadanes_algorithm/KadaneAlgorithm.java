package org.example.part_3_data_structures_and_algorithms.__1_arrays._1_kadanes_algorithm;

import java.util.Arrays;

/*
 * Q: Find a non-empty sub array with the largest sum.
 * int[] array = {4, -1, 2, -7, 3, 4}
 *
 * A:
 * Technique 1: Brute Force
 * Technique 2: Kadane's Algorithm
 * Technique 3: Sliding Window
 */
public class KadaneAlgorithm {
    // Brute Force: O(n^2)
    public static int bruteForce(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int currentSum = 0;
            for (int j = i; j < array.length; j++) {
                currentSum += array[j];
                sum = Math.max(currentSum, sum);
            }
        }
        return sum;
    }

    // Kadane's Algorithm: O(n)
    public static int kadanes(int[] array) {
        int sum = array[0];
        int currentSum = 0;
        for (int j : array) {
            currentSum = Math.max(currentSum, 0);
            currentSum += j;
            sum = Math.max(sum, currentSum);
        }
        return sum;
    }

    // Sliding window variation of Kadane's: O(n)
    public static int[] slidingWindow(int[] array) {
        int sum = array[0];
        int currentSum = 0;
        int maxL = 0;
        int maxR = 0;
        int leftIndex = 0;
        for (int rightIndex = 0; rightIndex < array.length; rightIndex++) {
            if (currentSum < 0) {
                currentSum = 0;
                leftIndex = rightIndex;
            }
            currentSum += array[rightIndex];
            if (currentSum > sum) {
                sum = currentSum;
                maxL = leftIndex;
                maxR = rightIndex;
            }
        }
        return new int[]{maxL, maxR};
    }

    public static void main(String[] args) {
        int[] array = {4, -1, 2, -7, 3, 4};
        System.out.println(bruteForce(array));
        System.out.println(kadanes(array));
        System.out.println(Arrays.toString(slidingWindow(array)));
    }
}
