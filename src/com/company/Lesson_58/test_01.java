package com.company.Lesson_58;

/**
 * Created by Pc on 14.05.2017.
 */
public class test_01 {
    public static void main(String[] args) {
        int[] arr = {123, 33, 213, 45, 65, 2, 2, 4};
        sortArryay(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sortArryay(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
