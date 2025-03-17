package org.java.SelfPractice;

import java.util.HashMap;

public class CountWords {
    public static void main(String[] args){

        String input = "banana apple banana apple orange papaya apple";

        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String word: input.split(" ")){
            wordCount.put(word, wordCount.getOrDefault(word,0)+1);
        }
        System.out.println("The Frequency of Words: " +wordCount);
    }
}
