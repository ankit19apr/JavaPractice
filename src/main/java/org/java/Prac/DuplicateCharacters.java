package org.java.Prac;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateCharacters {

    public static void main(String[] args){

        String s = "abcdhsjdhskabcdeg";
        char[] charArr = s.toCharArray();

        ArrayList<Character> list = new ArrayList<>();

        for(char c: charArr){
            list.add(c);
        }
        System.out.println("List of character:" +list);



        HashSet<Character> filteredSet = new HashSet<>();
        HashSet<Character> duplicateSet = new HashSet<>();

        for(char ch: list){
            if(!filteredSet.add(ch)){
                duplicateSet.add(ch);
            }
        }
        System.out.println("Duplicate Characters are: " +duplicateSet);
    }
}
