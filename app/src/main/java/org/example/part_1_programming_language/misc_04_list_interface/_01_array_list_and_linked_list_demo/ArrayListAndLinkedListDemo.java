package org.example.part_1_programming_language.misc_04_list_interface._01_array_list_and_linked_list_demo;

import java.util.*;

public class ArrayListAndLinkedListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println("arrayList:");
        System.out.println(arrayList);

        arrayList.add(0, 10);
        arrayList.add(3, 40);

        System.out.println("updated arrayList:");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        System.out.println("linkedList:");
        System.out.println(linkedList);

        linkedList.add(1, "red");
        System.out.println("updated linkedList:");
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println("removed element linkedList:");
        System.out.println(linkedList);

        linkedList.addFirst("green");
        System.out.println("updated linkedList:");
        System.out.println(linkedList);

        // display linkedList forward
        System.out.print("Display LinkedList forward:");
        ListIterator<Object> forwardIterator = linkedList.listIterator();
        while(forwardIterator.hasNext())
            System.out.print(" " + forwardIterator.next());
        System.out.println();

        System.out.print("Display LinkedList backward:");
        while(forwardIterator.hasPrevious())
            System.out.print(" " + forwardIterator.previous());
        System.out.println();
    }
}
