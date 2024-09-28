package org.example.part_3_data_structures_and_algorithms._4_hashtable;

class HTConstructor {
    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    int size = 7;
    Node[] dataMap;

    HTConstructor() {
        this.dataMap = new Node[size];
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("{" + temp.key + ": " + temp.value + "}");
                temp = temp.next;
            }
        }
        System.out.println();
    }
}
