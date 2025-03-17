package org.java.SelfPractice;

import java.util.HashMap;

public class FrequencyOfElement {

    public static void main(String [] args){

        String str = "abcdjkabdfgkiai";
        char [] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        System.out.println("Character Frequencies: " +map);
    }
}
