package org.java.programs;

import java.util.HashMap;

public class FindDuplicates {

    public static void main(String[] args){

        int[] nums = {1,2,3,3,2,4,5,1};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        System.out.println("Duplicate Elements are: ");
        for(int key: map.keySet()){
            if(map.get(key)>1){
                System.out.println(key + "appears" +map.get(key) + "times");

            }
        }
    }
}
