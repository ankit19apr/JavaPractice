package org.java.natwest;
import java.util.HashSet;

public class LongestUniqueSubString{

    public static void main(String[] args){

        String input = "Software_Programmer";

        System.out.println("The Longest Substring for 'Software_Programmer' is :" + findLongestSubstring(input));
    }

    public static String findLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();

        int left =0;
        String longestSubstring = "";

        StringBuilder currentSubstring = new StringBuilder();

        for(int right = 0; right<s.length(); right++)
        {
            char current = s.charAt(right);


            //remove characters from start until there are no duplicates

            while(set.contains(current)){
                set.remove(s.charAt(left));
                currentSubstring.deleteCharAt(0);
                left++;
            }

            //add current character to currentSubstring

            set.add(current);
            currentSubstring.append(current);

            //update the longest substring if currentSubstring is longer

            if(currentSubstring.length() > longestSubstring.length()){
                longestSubstring=currentSubstring.toString();
            }
        }
        return longestSubstring;
    }
}