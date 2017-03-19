package com.company.Lesson_08_List_Set_Map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Pc on 05.10.2016.
 */

public class Test_03 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("3");
        set.add("1");
        set.add("5");
        set.add("8");

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }

        for (String text : set) {
            System.out.println(text);
        }
    }
}
