package org.java.SelfPractice;

public class FirstLetterOfEachWord {
    public static void main(String[] args) {
        String input = "banana apple orange papaya";

        for (String word : input.split(" ")) {
            char firstLetter = word.charAt(0);
            System.out.println("First letter of " + word + ": " + firstLetter);
        }
    }
}