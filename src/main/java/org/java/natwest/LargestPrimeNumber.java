package org.java.natwest;

import java.util.Scanner;

public class LargestPrimeNumber {

    public static boolean isPrimeNumber(int number){

        if(number<=1){
            return false;
        }
        for(int i=2; i <= Math.sqrt(number); i++)
        {
            if(number % i == 0){
                return false; // not prime
            }
        }
        return true; // is Prime
    }

    // Method to find largest prime number less than or equal to given number

    public static int findLargestPrime(int number){

        // start from the given number and work around

        for (int i = number; i >= 2; i--){
            if(isPrimeNumber(i)){
                return i; // return the first prime number found
            }
        }
        return -1; // return -1 if no prime number is found for (for input <=1)
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();

        //find largest prime number less than or equal to given number

        int largestPrimeNumber = findLargestPrime(number);

        if(largestPrimeNumber != -1){
            System.out.println("The largest prime number less than or equal to " +number+ " is : " +largestPrimeNumber);
        }else {
            System.out.println("No number found less than or equal to " +number);
        }
        scanner.close();
    }

}
