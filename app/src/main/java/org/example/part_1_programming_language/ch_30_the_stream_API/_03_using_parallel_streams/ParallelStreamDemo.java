package org.example.part_1_programming_language.ch_30_the_stream_API._03_using_parallel_streams;

/*
 * 3rd form of reduce operation -
 * <U> U reduce (U identity,
 *              BiFunction<U, ? super T> accumulator,
 *              BinaryOperator<U> combiner)
 *
 *      combiner defines the function that combines two values that have been produced by the accumulator function
 *
 * switch a parallel stream to sequential by calling sequential() method
 *
 * forEach() method may not preserve the ordering of a parallel stream
 * consider using forEachOrdered() method,,, to perform operation while preserving the order
 *
 */

import java.util.ArrayList;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        ArrayList<Double> myLIst = new ArrayList<>();
        myLIst.add(7.0);
        myLIst.add(18.0);
        myLIst.add(10.0);
        myLIst.add(24.0);
        myLIst.add(17.0);
        myLIst.add(5.0);

        double productOfSquareRoots = myLIst.parallelStream().reduce(
                1.0,
                (a, b) -> a * Math.sqrt(b),
                (a, b) -> a * b
        );
        System.out.println("product of square roots: " + productOfSquareRoots);
    }
}
