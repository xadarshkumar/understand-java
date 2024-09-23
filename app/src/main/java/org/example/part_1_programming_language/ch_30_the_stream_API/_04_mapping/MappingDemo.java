package org.example.part_1_programming_language.ch_30_the_stream_API._04_mapping;

/*
 * To apply some transformation, to the element in a stream, sue map() method
 * <R> Stream<R> map(Function<? super T, ? extends R> mapFunction)
 *      R - type of elements of the new stream
 *      T - type of elements of the invoking stream
 *      mapFunction - does the mapping - stateless and non-invoking
 *
 * Stream API also provides flatMap(), multiMap() methods
 */

import java.util.ArrayList;
import java.util.stream.Stream;

public class MappingDemo {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        // Stream<Double> sqrtStream = myList.stream().map((a) -> Math.sqrt(a));
        Stream<Double> sqrtStream = myList.stream().map(Math::sqrt);

        double productOfSquareRoots = sqrtStream.reduce(1.0, (a, b) -> a * b);
        System.out.println("product of square roots: " + productOfSquareRoots);

    }
}
