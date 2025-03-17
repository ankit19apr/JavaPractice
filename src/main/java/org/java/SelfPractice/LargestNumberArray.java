package org.java.SelfPractice;

public class LargestNumberArray {

    public static void main(String[] args){

        int [] arr = {22,44,11,33,55,77,21};

        int maxNum= 0;
        for(int num: arr){
            if(num>maxNum){
                maxNum =num;
            }
        }
        System.out.println("Largest Number: " +maxNum);
    }
}
