package org.java.programs;

import java.util.HashMap;

public class PairSum {

    public static void main(String[] args){

        int[] nums = {2,7,11,15};
        int target =9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            int complement = target-num;
            if (map.containsKey(complement)){
                System.out.println("Pair Found : (" + complement + "," +num + ")");
            }
            map.put(num, 1);
        }
    }
}
