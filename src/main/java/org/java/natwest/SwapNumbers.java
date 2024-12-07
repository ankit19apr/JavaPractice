package org.java.natwest;



import java.util.Scanner;

public class SwapNumbers{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter 2nd Number: ");
        int num2 = scanner.nextInt();

        System.out.println("Numbers before Swapping: 1st Number is " + num1 + ", 2nd Number is " + num2);

        //Swapping numbers num1 and num2

        num1  =num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Number1 after Swapping is " +num1);
        System.out.println("Number2 after swapping is " +num2);

        scanner.close();
    }
}