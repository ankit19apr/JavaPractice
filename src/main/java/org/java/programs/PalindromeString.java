package org.java.programs;

import java.util.Scanner;

public class PalindromeString {
        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a String");
            String input = scanner.nextLine();

            if (isPalindrome(input)){
                System.out.println("The String \""  + input + "\" is Palindrome");
            }else{
                System.out.println("The String \""  + input +  "\" is not palindrome");
            }
        scanner.close();
    }


        public static boolean isPalindrome(String s){

            s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int left =0;
            int right = s.length()-1;

            while(left<right){
                if (s.charAt(left)!=s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }






