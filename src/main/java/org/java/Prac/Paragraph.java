package org.java.Prac;

//        1. counting of char
//        2. counting of capital letter character
//        3. how many lines
//        4. small characters
//        5. read it from text file

import java.io.*;
import java.util.*;

public class Paragraph {

    public static void main(String[] args) {
        try {
            // Read content from a text file
            File file = new File("C:/Users/USER/eclipse-workspace/JavaPractice/input.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            StringBuilder content = new StringBuilder();
            String line;
            int lineCount = 0;

            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
                lineCount++;
            }
            br.close();

            // Convert content to string
            String input = content.toString();

            // Count total characters
            int totalCharacters = input.length();

            // Count uppercase and lowercase letters
            int upperCaseCount = 0;
            int lowerCaseCount = 0;
            Map<Character, Integer> charFrequency = new HashMap<>();

            for (char c : input.toCharArray()) {
                // Count uppercase and lowercase characters
                if (Character.isUpperCase(c)) {
                    upperCaseCount++;
                } else if (Character.isLowerCase(c)) {
                    lowerCaseCount++;
                }

                // Count character frequencies
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }

            // Output results
            System.out.println("Total number of characters in the paragraph: " + totalCharacters);
            System.out.println("Total number of uppercase characters: " + upperCaseCount);
            System.out.println("Total number of lowercase characters: " + lowerCaseCount);
            System.out.println("Total number of lines: " + lineCount);
            System.out.println("Character frequency: " + charFrequency);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}


