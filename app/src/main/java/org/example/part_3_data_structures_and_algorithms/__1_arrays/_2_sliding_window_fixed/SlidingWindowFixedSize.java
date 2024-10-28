package org.example.part_3_data_structures_and_algorithms.__1_arrays._2_sliding_window_fixed;

import java.util.HashSet;

/*
 * Q: Given an array, return if there are two elements within a window of size k that are equal
 * int[] array = {1,2,3,2,3,3}
 *
 * A:
 * Technique 1: Brute Force
 * Technique 2: Sliding Window Fixed Size
 */
public class SlidingWindowFixedSize {
    // Brute Force: O(n * k)
    public static boolean bruteForce(int[] array, int k) {
        for (int leftIndex = 0; leftIndex < array.length; leftIndex++) {
            for (int rightIndex = leftIndex; rightIndex < Math.min(array.length, leftIndex + k); rightIndex++) {
                if (array[leftIndex] == array[rightIndex]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean slidingWindowFixedSize(int[] array, int k) {
        HashSet<Integer> window = new HashSet<>();
        int leftIndex = 0;
        for (int rightIndex = 0; rightIndex < array.length; rightIndex++) {
            if (rightIndex - leftIndex + 1 > k) {
                window.remove(array[leftIndex]);
                leftIndex++;
            }
            if (window.contains(array[rightIndex])) {
                return true;
            }
            window.add(array[rightIndex]);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 3, 3};
        System.out.println(bruteForce(array, 3));
        System.out.println(slidingWindowFixedSize(array, 3));
    }

}
