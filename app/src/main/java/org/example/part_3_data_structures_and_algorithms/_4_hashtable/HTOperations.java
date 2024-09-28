package org.example.part_3_data_structures_and_algorithms._4_hashtable;

import java.util.ArrayList;
import java.util.List;

public class HTOperations extends HTConstructor {
    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int asciiValue : keyChars) {
            hash = (hash + asciiValue * 23) % size;
        }
        return hash;
    }

    public void set(String key, int value) {
        Node newNode = new Node(key, value);
        int index = this.hash(key);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void get(String key) {
        int index = this.hash(key);
        Node temp = dataMap[index];
        int flag = 0;
        while (temp != null) {
            if (temp.key == key) {
                System.out.println("Found: {" + temp.key + " = " + temp.value + "}");
                flag = 1;
                break;
            }
            temp = temp.next;
        }

        if (flag == 0) {
            System.out.println("Not found: " + key);
        }
    }

    public void getAllKeys() {
        List<String> listKeys = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                listKeys.add(temp.key);
                temp = temp.next;
            }
        }
        System.out.println("All keys: " + listKeys);
    }
}
