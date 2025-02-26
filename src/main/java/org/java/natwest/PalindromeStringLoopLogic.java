package org.java.natwest;
import java.util.Scanner;
public class PalindromeStringLoopLogic {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String original = scanner.nextLine();
            scanner.close();

            // Reverse the string manually using a for loop
            String reversed = "";
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed = reversed + original.charAt(i);
            }

            // Check if the original and reversed strings are the same
            if (original.equalsIgnoreCase(reversed)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is NOT a palindrome.");
            }
        }
    }


