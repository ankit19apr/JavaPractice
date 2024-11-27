package org.java.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapByValues {

    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 2);
        map.put("B", 1);
        map.put("C", 3);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        System.out.println("Comparing by values: ");
        for (Map.Entry<String, Integer> entry: list){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}
