package org.java.programs;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElementsInArray {

    public static void main(String[] args){

        int[] arr1 = {1,2,3,4,3,4,6,7};
        int[] arr2 = {2,4,3,5,6,7,8,1};

        ArrayList<Integer> commElements = new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j< arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    if(!commElements.contains(arr1[i])){
                        commElements.add(arr1[i]);
                    }
                }
            }
        }
        System.out.println("Array 1 elements are :" + Arrays.toString(arr1));
        System.out.println("Array 2 elements are :" + Arrays.toString(arr2));
        System.out.print("Common elements in Arrays: " +commElements);

    }
}
