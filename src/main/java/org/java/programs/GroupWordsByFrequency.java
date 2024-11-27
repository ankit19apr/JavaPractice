package org.java.programs;

import java.util.HashMap;

public class GroupWordsByFrequency {
    public static void main(String[] args){

        String text = "apple banana apple orange mango orange mango";
        HashMap<String, Integer> wordCount = new HashMap<>();
        for(String word: text.split(" ")){
            wordCount.put(word, wordCount.getOrDefault(word,0) +1);

        }
        System.out.println("Word Frequencies: " +wordCount);
    }

}
