package org.java.programs;

public class ReverseWords {

    public static void main(String[] args){

        String input = " java is fun";

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word: words){
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        System.out.println("Reversed Sentence : " + result.toString().trim());
    }
}
