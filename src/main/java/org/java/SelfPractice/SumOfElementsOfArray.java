package org.java.SelfPractice;

public class SumOfElementsOfArray {

    public static void main(String[] args){


    int [] arr = {22,44,11,33,55,77,21};
    int sum = 0;

    for(int i: arr){
        sum = sum + i;
    }


        System.out.println("Sum of Elements: " +sum);
}
}
