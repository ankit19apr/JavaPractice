package org.java.programs;

import java.util.HashMap;

public class MostFrequentCharacter {

    public static void main(String[] args){

        String input = "success";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for(char c: input.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c,0) +1);
        }
        char mostFrequent = ' ';
        int maxCount =0;
        for(char c: charCountMap.keySet()){
            if(charCountMap.get(c) > maxCount){
                maxCount = charCountMap.get(c);
                mostFrequent = c;
            }
        }
        System.out.println("Most Frequent Character: " + mostFrequent + " (Count: " + maxCount + ")");
    }
}
