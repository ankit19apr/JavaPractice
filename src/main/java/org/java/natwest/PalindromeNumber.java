package org.java.natwest;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args){

       System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean result = isPalindrome(number);

        if(result){
            System.out.println( number + " is Palindrome");
        }else{
            System.out.println( number + " is not Palindrome");
        }
    }

    public static boolean isPalindrome(int number){
        int originalNumber=number;
        int reversed = 0;

        while(number!=0){
            int digit = number % 10;
            reversed = reversed*10 + digit;
            number = number/10;
        }
        return originalNumber == reversed;

    }
}
