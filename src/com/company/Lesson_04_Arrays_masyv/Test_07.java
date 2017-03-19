package com.company.Lesson_04_Arrays_masyv;

/**
 * Created by user on 21.09.2016.
 */
public class Test_07 {
    public static void main(String[] args) {
        int[] arr = {4, 87, 1, -5, -17, 0, 8};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
