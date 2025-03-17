package org.java.Prac;

public class FindTwoMaxValues {

    public static void main(String[] args){

        int[] list = {15, 24, 48, 21, 43, 11, 79, 93};
        FindTwoMaxValues maxValues = new FindTwoMaxValues();
        maxValues.getTwoMaxValues(list);
    }

    public  void getTwoMaxValues(int[] nums) {

        int maxOne=0;
        int maxTwo=0;

        for(int n: nums){
            if(n>maxOne){
                maxTwo = maxOne;
                maxOne = n;
            }else if (n>maxTwo){
                maxTwo = n;
            }
        }
        System.out.println("First Max Number: " +maxOne);
        System.out.println("Second Max Number: " +maxTwo);
    }
}
