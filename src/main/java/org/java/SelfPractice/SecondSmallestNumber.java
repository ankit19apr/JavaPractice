package org.java.SelfPractice;

public class SecondSmallestNumber {

        public static void main(String[] args){

            int [] arr = {22,44,11,33,55,77,21};

            int minNum1= arr[0];
            int minNum2 = arr[0];
            for(int num: arr){
                if(num<minNum1){
                    minNum2 =minNum1;
                    minNum1 = num;
                }else if(num<minNum2){
                    minNum2 =num;
                }
            }

            System.out.println("Second Smallest Number: " +minNum2);
        }
    }