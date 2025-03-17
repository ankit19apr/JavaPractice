package org.java.Prac;

public class RemoveExtraSpaces {
    public static void main(String[] args){
    String str = "I    am   Ankit      Sharma   ";
    String result = removeExtraSpaces(str);

    System.out.println("Original String is : " +str);
    System.out.println("After removing extra Spaces String is : " +result);
    }
    public static String removeExtraSpaces(String s){

        String resultString = s.replaceAll("\\s+", " ").trim();
        return resultString;
    }

}
