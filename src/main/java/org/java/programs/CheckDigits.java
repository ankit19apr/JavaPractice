package org.java.programs;

public class CheckDigits {

    public static void main(String[] args){
        String input = "123456";

        if(input.matches("\\d+")){
            System.out.println("String contain only digits");
        }else{
            System.out.println("String contains non-digit characters");
        }

    }
}
