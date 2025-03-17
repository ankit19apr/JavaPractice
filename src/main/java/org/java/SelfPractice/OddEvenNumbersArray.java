package org.java.SelfPractice;

import java.util.ArrayList;

public class OddEvenNumbersArray {
    public static void main(String[] args){

        int [] arr = {22,44,11,33,55,77,21};

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int num: arr){
            if(num%2==0){
                even.add(num);
            }else{
                odd.add(num);
            }
        }
        System.out.println("Even Numbers in Array: " +even);
        System.out.println("Odd Numbers in Array: " +odd);
    }
}
