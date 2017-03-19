package com.company.Lesson_47;

import java.util.Arrays;

/**
 * Created by Pc on 19.03.2017.
 */
public class Test_02 {
    public static void main(String[] args) {
        int[] mas = {-6, -4, 1, 2, 3, 5};

        for (int ma :  sortedSquaredArray(mas)) {
            System.out.println(ma);
        }
    }

    public static int[] sortedSquaredArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * array[i];
        }

        Arrays.sort(result);
        return result;
    }
    /*int[] sortedSquaredArray(int[] array) {


        for (int i = 0; i <array.length; i++) {

            System.out.println(array[i]* array[i]);


        }

        return array;
    }*/
}
