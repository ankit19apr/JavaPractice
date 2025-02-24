package org.java.programs;

import java.util.*;

public class MoveZeroToEnd {


    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 3, 4, 0, 7};

        moveZero(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void moveZero(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {

                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}



