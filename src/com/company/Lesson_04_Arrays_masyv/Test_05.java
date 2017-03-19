package com.company.Lesson_04_Arrays_masyv;

/**
 * Created by user on 21.09.2016.
 */
public class Test_05 {
    public static void main(String[] args) {
        int[] ar = new int[10];
        ar[2] = 5;
        ar[4] = 8;
        ar[0] = 3;
        ar[9] = 9;

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }


    }
}
