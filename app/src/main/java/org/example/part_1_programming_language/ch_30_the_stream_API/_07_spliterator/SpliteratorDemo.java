package org.example.part_1_programming_language.ch_30_the_stream_API._07_spliterator;

/*
 * Spliterator offers and alternative to Iterator, especially when parallel processing is involved.
 *
 * boolean tryAdvance(Consumer<? super T> action)
 *      - it performs an action on the next element and then advances the iterator.
 *
 * default void forEachRemaining(Consumer<? super T> action)
 *      - to perform some action on each element collectively, rather than one at a time.
 *
 * Spliterator<T> trySplit()
 *      - it splits the elements being iterated in two, returning a new Spliterator to on of the partitions.
 *      - other partition remains accessible by the original Spliterator
 */

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");

        Stream<String> myStream = myList.stream();

        Spliterator<String> splitItr = myStream.spliterator();
        while (splitItr.tryAdvance((n) -> System.out.println(n))) ;

        myStream = myList.stream();
        splitItr = myStream.spliterator();
        Spliterator<String> splitItr2 = splitItr.trySplit();
        if (splitItr2 != null) {
            System.out.println("Output from splitItr2");
            splitItr2.forEachRemaining((n) -> System.out.println(n));
        }

        System.out.println("Output from splitItr");
        splitItr.forEachRemaining((n) -> System.out.println(n));
    }
}
