package org.java.SelfPractice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine();

        boolean pal = palindromeString(str);
        if (pal) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

        scanner.close(); // Closing scanner to prevent memory leak
    }

    public static boolean palindromeString(String s) {
        String result = "";
        for (char c : s.toCharArray()) {
            result = c + result; // Reverse string by adding characters at the beginning
        }
        return result.equals(s);
    }
}
