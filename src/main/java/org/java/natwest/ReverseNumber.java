package org.java.natwest;

public class ReverseNumber {

    public static void main(String[] args){

        int number = 45678;

        System.out.println("Original Number:" + number);
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed Number:" +reversedNumber);
    }

    public static int reverseNumber(int number){
        int reversed = 0;

        while(number!=0){
            int digit = number % 10;
            reversed = reversed*10 + digit;
            number = number/10;
        }
        return reversed;

    }
}
