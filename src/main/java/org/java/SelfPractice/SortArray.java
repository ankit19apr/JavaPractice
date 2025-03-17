package org.java.SelfPractice;

import java.util.ArrayList;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {22, 44, 11, 33, 55, 77, 21};

        // Bubble Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // Swap if current element is greater than next
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Store sorted elements in ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        System.out.println("Sorted Array: " + list);
    }
}
