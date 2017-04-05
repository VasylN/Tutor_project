package com.company.Lesson_48;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Pc on 26.03.2017.
 */
public class RemoveDuplicateAdjacent {
    public static void main(String[] args) {
        String s = "csertergergtttttyyyyterrt454";
        System.out.println(removeDuplicateAdjacent(s));

    }

    public static String removeDuplicateAdjacent(String s) {
        for (int i = 0; i < s.length(); i++) {
            s = s.replaceAll("(.)(\\1)+", "");
        }
        return s;
    }

}

