package org.java.SelfPractice;

public class FirstAndLastLetterOfEachWord {
    public static void main(String[] args){
        String input = "banana apple orange papaya";

        for(String word: input.split(" ")){
            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length()-1);
            System.out.println("First letter of " +word+ ": " +firstLetter);
            System.out.println("Last letter of " +word+ ": " +lastLetter);
        }

    }
}
