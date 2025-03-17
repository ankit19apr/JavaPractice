package org.java.Prac;

public class ExtractStringComponents {
    public static void main(String[] args) {
        String inputString = "12345asdjasjkWWWjdajSJDJFK";

        // Use StringBuilder for efficient string manipulation
        StringBuilder digits = new StringBuilder();
        StringBuilder lowercase = new StringBuilder();
        StringBuilder uppercase = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch); // Append digit to StringBuilder
            } else if (Character.isLowerCase(ch)) {
                lowercase.append(ch); // Append lowercase to StringBuilder
            } else if (Character.isUpperCase(ch)) {
                uppercase.append(ch); // Append uppercase to StringBuilder
            }
        }

        // Output the results
        System.out.println("Digits: " + digits);
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Uppercase: " + uppercase);
    }
}
