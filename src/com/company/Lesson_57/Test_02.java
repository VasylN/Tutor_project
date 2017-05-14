package com.company.Lesson_57;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Pc on 10.05.2017.
 */
public class Test_02 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("sd");
        linkedList.add("sASDFd");
        linkedList.add("sdsdSDFf");
        linkedList.add("sdSDFSDFSD");

        for (String s : linkedList) {
            System.out.println(linkedList.descendingIterator());
        }
    }
}
