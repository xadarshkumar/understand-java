package org.example.part_1_programming_language.ch_30_the_stream_API._02_reduction_operation;

/*
 * min(), max(), count() are special cases of reduction because each reduces a stream to a single value
 * Stream API generalises this concept by providing reduce() method
 *
 * versions of reduce()
 * - Optional<T> reduce(BinaryOperator<T> accumulator)
 * - T reduce(T identityVal, BinaryOperator<T> accumulator)
 *
 * accumulator function must be - stateless, non-interfering, associative
 *
 */

import java.util.ArrayList;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        Optional<Integer> productObject = myList.stream().reduce((a, b) -> a * b);
        productObject.ifPresent(p -> System.out.println("product(as Optional): " + p));

        int product = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("product(as Int): " + product);
    }
}
