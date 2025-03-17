package org.java.Prac;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateNumbers {


    public static void main(String[] args) {
        // Step 1: Create an ArrayList of strings for numbers 0-9
       Integer[] arr = { 2,3,5,2,5,3,1,5};
       ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            numberList.add(arr[i]);
        }

        System.out.println("Original list: " + numberList);
        HashSet<Integer> filteredSet = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();

        for(int num: numberList){
            if(!filteredSet.add(num)){
                duplicateSet.add(num);
            }
        }
        System.out.println("Duplicate Numbers: " +duplicateSet);

    }
}