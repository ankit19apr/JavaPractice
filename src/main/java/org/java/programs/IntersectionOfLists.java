package org.java.programs;

import java.util.ArrayList;

public class IntersectionOfLists {
    public static void main(String[] args){

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        list1.retainAll(list2);

        System.out.print(list1);
    }

}
