package com.company.Lesson_35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 25.01.2017.
 * while(true) -> List -> array -> sort(array) -> binarySearch -> index of value
 */
public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            int i = Integer.parseInt(s);
            list.add(i);
        }
        Integer[] array = list.toArray(new Integer[list.size()]);
        sortArray(array);
        System.out.println("Enter a number which find: ");
        Integer x = Integer.parseInt(reader.readLine());
        System.out.println(searchBinary(x, array));
    }

    private static int searchBinary(Integer value, Integer[] array) {
        return searchBinary(value, array, 0, array.length - 1);
    }

    private static int searchBinary(Integer val, Integer[] arr, int lo, int hi) {
        if (lo > hi) return -1;

        int mid = lo + (hi - lo) / 2;

        if (val < arr[mid]) {
            return searchBinary(val, arr, 0, mid - 1);
        } else if (val > arr[mid]) {
            return searchBinary(val, arr, mid + 1, hi);
        } else return mid;
    }

    private static void sortArray(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }
}
