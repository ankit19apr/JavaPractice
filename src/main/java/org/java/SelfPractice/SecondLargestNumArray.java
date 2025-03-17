package org.java.SelfPractice;

public class SecondLargestNumArray {
    public static void main(String[] args){
        int [] arr ={11,44,22,55,33,49};
        int maxOne=0;
        int maxTwo=0;

        for(int num: arr){
            if(num>maxOne){
                maxTwo =maxOne;
                maxOne=num;
            }else if(num > maxTwo){
                maxTwo =num;
            }
        }
        System.out.println("Second Largest Number: " +maxTwo);
    }
}
