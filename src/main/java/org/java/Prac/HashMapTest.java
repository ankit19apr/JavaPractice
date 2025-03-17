package org.java.Prac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        // Initialize a HashMap with type-safe parameters
        Map<Integer, Character> hashMap = new HashMap<>();
        hashMap.put(1, 'a');
        hashMap.put(2, 'b');
        hashMap.put(3, 'a');

        // HashSet to track unique values
        HashSet<Character> set = new HashSet<>();

        // Iterate through the entries using a for-each loop
        for (Map.Entry<Integer, Character> entry : hashMap.entrySet()) {
            // Retrieve the value from the entry
            Character value = entry.getValue();

            // Add the value to the HashSet for uniqueness
            set.add(value);
        }

        System.out.println("Unique Values: " + set);
    }
}
