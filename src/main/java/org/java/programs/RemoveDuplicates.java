package org.java.programs;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(5);

        HashSet<Integer> uniqueSet = new HashSet<>(list);
        list = new ArrayList<>(uniqueSet);

        System.out.println("List after removing duplicates: " +list);
    }
}