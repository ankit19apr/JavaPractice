package org.java.natwest;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        boolean result = isPrime(number);

        if(result){
            System.out.println(number + " is prime number");
        }else{
            System.out.println(number + " is not prime number");
        }
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                return false; //not prime
            }
        }
        return true; //prime number
    }
}

