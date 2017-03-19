package com.company.Lesson_04_Arrays_masyv;

/**
 * Created by user on 21.09.2016.
 */
public class Test_03 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
