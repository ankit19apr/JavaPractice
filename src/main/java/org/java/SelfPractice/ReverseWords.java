package org.java.SelfPractice;

import java.util.HashMap;

public class ReverseWords {
    public static void main(String[] args){
        String input = "banana apple banana apple orange papaya apple";


        StringBuilder sb = new StringBuilder();
        for(String word: input.split(" ")){
            String sortedWord = "";
            char [] wordArr = word.toCharArray();
            for(int i = wordArr.length-1; i>=0;i--){
                sortedWord = sortedWord + wordArr[i];
            }
            sb.append(sortedWord + " ");

        }
        System.out.println("Words in Reverse Order: " +sb);

    }

}
