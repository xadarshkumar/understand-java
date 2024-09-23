package org.example.part_1_programming_language.ch_30_the_stream_API._06_using_iterator_with_a_stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class IteratorStreamDemo {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");

        Stream<String> myStream = myList.stream();

        Iterator<String> itr = myStream.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
