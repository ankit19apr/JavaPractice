package org.java.programs;

public class RemoveDuplicatesString {

    public static void main(String[] args){
        String input = "programming";
        StringBuilder result = new StringBuilder();

        for(char c: input.toCharArray()){
            if(result.indexOf(String.valueOf(c)) == -1){
                result.append(c);

            }
        }
        System.out.println("String after removing duplicates : " + result.toString());
    }
}
