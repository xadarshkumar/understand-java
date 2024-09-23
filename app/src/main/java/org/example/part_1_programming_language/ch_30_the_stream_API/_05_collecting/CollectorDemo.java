package org.example.part_1_programming_language.ch_30_the_stream_API._05_collecting;

/*
 * to obtain a collection from stream, we generally use collect() method
 * It has 2 forms -
 *      - <R, A> R collect(Collector<> super T,A,R> collectorFunc)
 *
 *      - <R> R collect(Supplier<R> target, BiConsumer<R, ? super T> accumulator, BiConsumer<R,R> combiner)
 *          target - specifics how the object that holds the result is created
 *          accumulator - adds an element to the result
 *          combiner - combines two partial result
 *
 * the collect() method performs mutable reduction
 * this is because the result of the reduction is a mutable storage object
 * if you want unmodifiable collection - use toList() method in the stream
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorDemo {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-5555", "Larry@abc.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "James@abc.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333", "Mary@abc.com"));

        Stream<NamePhone> namePhone = myList.stream().map((a) -> new NamePhone(a.name, a.phone));
        List<NamePhone> npList = namePhone.toList();
        System.out.println("name and phone in the list: ");
        for (NamePhone np : npList) {
            System.out.println(np.name + ": " + np.phone);
        }

        namePhone = myList.stream().map((a) -> new NamePhone(a.name, a.phone));
        Set<NamePhone> npSet = namePhone.collect(Collectors.toSet());
        System.out.println("name and phone in the set: ");
        for (NamePhone np : npSet)
            System.out.println(np.name + ": " + np.phone);
    }
}
