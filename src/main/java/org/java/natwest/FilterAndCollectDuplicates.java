package org.java.natwest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilterAndCollectDuplicates {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of strings for numbers 0-9
       ArrayList<String> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(String.valueOf(i));
        }

        System.out.println("Original list: " + numberList);

        // Step 2: Add another set of numbers 0-5 as strings to the list
        for (int i = 0; i <= 5; i++) {
            numberList.add(String.valueOf(i));
        }

        System.out.println("List after adding 0-5: " + numberList);

        // Step 3: Use Sets to filter duplicates and maintain unique elements
        Set<String> filteredSet = new HashSet<>();
        Set<String> duplicateSet = new HashSet<>();

        for (String number : numberList) {
            // If number cannot be added to filteredSet, it's a duplicate
            if (!filteredSet.add(number)) {
                duplicateSet.add(number);
            }
        }

       /* // Step 4: Convert Sets to Lists for output (if needed)
        List<String> filteredList = new ArrayList<>(filteredSet);
        List<String> duplicateList = new ArrayList<>(duplicateSet);*/

        // Print the results
        System.out.println("Filtered Set (no duplicates): " + filteredSet);
        System.out.println("Duplicate elements Set: " + duplicateSet);
    }
}
