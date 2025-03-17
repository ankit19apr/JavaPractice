package org.java.SelfPractice;

public class LastLetterOfEachWord {
    public static void main(String[] args){
        String input = "banana apple orange papaya";

        for(String word: input.split(" ")){
            char lastLetter = word.charAt(word.length()-1);
            System.out.println("Last letter of " +word+ ": " +lastLetter);
        }

    }
}
