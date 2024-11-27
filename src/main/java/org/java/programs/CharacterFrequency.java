package org.java.programs;

import java.util.HashMap;

public class CharacterFrequency {

    public static void main(String[] args){

        String input = "interview";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for(char c : input.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c,0) +1);
            }
        System.out.println("Character Frequencies : " +charCountMap);
    }
}
