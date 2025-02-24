package org.java.programs;

import java.util.Locale;

public class MoveVowelsToEnd {

    public static void main(String[] args) {
        String str = "abcdefhij";
        System.out.println("Rearranged String: " + moveVowelsToEnd(str));
    }

    public static String moveVowelsToEnd(String str) {

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        str = str.toLowerCase(Locale.ROOT);

        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                vowels.append(ch);
            } else {
                consonants.append(ch);
            }
        }
        return consonants.toString() + vowels.toString();
    }
}
