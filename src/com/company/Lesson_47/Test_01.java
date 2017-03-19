package com.company.Lesson_47;

import java.util.Arrays;

/**
 * Created by Pc on 19.03.2017.
 */
public class Test_01 {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 1, 2};
        System.out.println(containsDuplicates(mas));
    }

    public static boolean containsDuplicates(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1 ; i++) {
            if (a[i] == a[i + 1]) {
                return true;
            }

        }

        return false;
    }
}
