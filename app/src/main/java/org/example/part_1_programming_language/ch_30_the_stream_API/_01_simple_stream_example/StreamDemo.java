package org.example.part_1_programming_language.ch_30_the_stream_API._01_simple_stream_example;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("original list: " + myList);

        // obtain a stream to the array list
        Stream<Integer> myStream = myList.stream();

        // obtain min value
        Optional<Integer> minVal = myStream.min(Integer::compare);
        minVal.ifPresent(integer -> System.out.println("min val: " + integer));

        // obtain max value
        // we must obtain a new stream
        myStream = myList.stream();
        Optional<Integer> maxValue = myStream.max(Integer::compare);
        if (maxValue.isPresent()) {
            System.out.println("max value: " + maxValue.get());
        }

        // sort the stream by use of sorted()
        // display the sorted stream by use of forEach()
        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.print("sorted stream: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        // get only the odd values by the use of filter()
        // display the odd values by use of forEach()
        Stream<Integer> oddValues = myList.stream().filter((n) -> (n % 2) == 1);
        System.out.print("odd values: ");
        oddValues.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        // display only the odd values greater than 5
        oddValues = myList.stream()
                .filter((n) -> (n % 2) == 1)
                .filter((n) -> n > 5);
        System.out.print("odd values greater than 5: ");
        oddValues.forEach((n) -> System.out.print(n + " "));
        System.out.println();

    }
}
