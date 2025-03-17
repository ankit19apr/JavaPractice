package org.java.SelfPractice;

public class SmallestNumberArray {

    public static void main(String[] args){

        int [] arr = {22,44,11,33,55,77,21};

        int minNum= arr[0];
        for(int num: arr){
            if(num<minNum){
                minNum =num;
            }
        }

        System.out.println("Smallest Number: " +minNum);
    }
}
