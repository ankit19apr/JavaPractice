package org.java.SelfPractice;

import java.util.HashSet;

public class DuplicateElements {

    public static void main(String[] args){

        int [] arr = {1,2,1,3,4,2,5,3};

        HashSet<Integer> filteredSet = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();
        HashSet<Integer> uniqueElements = new HashSet<>();

        for(int i : arr){
            if(!filteredSet.add(i)){
                duplicateSet.add(i);
            }
        }
        System.out.println("Duplicate Elements: " +duplicateSet);

        for(int num: arr){
            if(!duplicateSet.contains(num)){
                uniqueElements.add(num);
            }
        }
        System.out.println("Unique Elements: " +uniqueElements);
    }
}
