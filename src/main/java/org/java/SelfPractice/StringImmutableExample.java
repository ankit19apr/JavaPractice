package org.java.SelfPractice;

public class StringImmutableExample {
    public static void main(String[] args) {
        // Creating a String object
        String str = "Hello";

        // Trying to modify the string by concatenation
        String newStr = str.concat(" World");

        // Printing original and new strings
        System.out.println("Original String: " + str);
        System.out.println("New String after modification: " + newStr);

        // Checking memory reference
        if (str == newStr) {
            System.out.println("Both refer to the same object (Mutable)");
        } else {
            System.out.println("Both refer to different objects (Immutable)");
        }
    }
}
