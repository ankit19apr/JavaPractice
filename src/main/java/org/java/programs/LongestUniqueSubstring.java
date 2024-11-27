package org.java.programs;

import java.util.HashSet;



public class LongestUniqueSubstring {

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Longest Unique Substring Length: " + findLength(input));
    }
    public static int findLength(String s){
            HashSet<Character> set = new HashSet<>();
            int maxLength=0, left = 0;

            for(int right=0; right< s.length();right++){
                while (set.contains(s.charAt(right))){
                    set.remove(s.charAt(left++));
                }
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength, right-left+1);
            }
            return maxLength;
    }

}
