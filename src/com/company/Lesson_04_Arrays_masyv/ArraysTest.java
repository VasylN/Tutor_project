package com.company.Lesson_04_Arrays_masyv;

/**
 * Created by user on 21.09.2016.
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] ar = new int[10]; // 0 - 4
        int a = 5;
        ar[0] = 6;
        ar[3] = 17;

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
