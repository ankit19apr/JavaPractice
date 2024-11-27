package org.java.programs;

import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String input = "aannkkiitt";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println("First Non-Repeating Character: " + c);
                return;
            }
        }
        System.out.println("No Non-Repeating Character found");
    }
}