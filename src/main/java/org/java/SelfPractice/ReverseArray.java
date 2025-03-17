package org.java.SelfPractice;

import java.util.ArrayList;

public class ReverseArray {

    public static void main(String[] args){

        int [] arr = { 1,2,3,4,5,6};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = arr.length-1; i>=0; i--){
            list.add(arr[i]);
        }

        System.out.println("Reversed Array :" +list);
    }
}
