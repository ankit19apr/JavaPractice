package org.java.programs;

public class StringReverse {

    public static void main(String[] args){
        String s = "ankit";
        StringBuilder stringBuilder = new StringBuilder(s);
        String reverseString = String.valueOf(stringBuilder.reverse());
        System.out.println("Reversed String is: " +reverseString);

        }
    }




