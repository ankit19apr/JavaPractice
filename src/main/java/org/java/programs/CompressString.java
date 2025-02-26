package org.java.programs;

import javax.print.DocFlavor;
import java.util.Locale;

public class CompressString {

    public static void main(String [] args){

        String input = "aaabbccca";

        String compressedString = compString(input);

        System.out.println("Compressed String is:" +compressedString);
    }

    public static String compString(String s){

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        sb.append(count).append(s.charAt(s.length() - 1));
        return sb.toString();
          }
}
