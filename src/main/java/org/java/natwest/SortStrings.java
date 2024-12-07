package org.java.natwest;

import java.util.Arrays;

public class SortStrings {

    public static void main(String[] args){

        String[] words = {"Jan", "Feb", "March", "Apr", "May","Jun", "Jul", "Aug",
        "Sep", "Oct", "nov", "dec"};
        System.out.println("Unsorted List of Words:");
        showList(words);

        Arrays.sort(words);
        System.out.println("Sorted List of Words:");

        showList(words);

        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Sorted List of words: Case-Insensitive :");
        showList(words);


    }

    public static void showList(String[] array){
        for(String str: array){
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
