package org.java.SelfPractice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine();

        String reversed = reverseString(str);

        System.out.println("Reversed String :" +reversed);

        scanner.close(); // Closing scanner to prevent memory leak
    }

    public static String reverseString(String s) {
        String result = "";
        for (char c : s.toCharArray()) {
            result = c + result; // Reverse string by adding characters at the beginning
        }
        return result;
    }
}
