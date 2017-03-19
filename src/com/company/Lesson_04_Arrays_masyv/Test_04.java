package com.company.Lesson_04_Arrays_masyv;

/**
 * Created by user on 21.09.2016.
 */
public class Test_04 {
    public static void main(String[] args) {
        int[] ar = new int[10];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = 9 - i;

        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
