package com.company.Lesson_06_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Pc on 28.09.2016.
 */
public class Test_09 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Collections.addAll(list1, 45, 34, 56, 2, -5, 0);
        Collections.addAll(list2, 55, 33, 3333, 56);

        list.addAll(list1);
        list.addAll(list2);

        for (Integer x : list) {
            System.out.println(x);
        }

    }
}
