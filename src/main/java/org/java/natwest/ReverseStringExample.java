package org.java.natwest;

public class ReverseStringExample {
    public static void main(String[] args) {
        String input = "Hello World!";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] chars = str.toCharArray();
        String result = "";

        // Loop through the string in reverse order
        for (int i = chars.length - 1; i >= 0; i--) {
            result = result + chars[i]; // Append each character
        }

        return result;
    }
}
