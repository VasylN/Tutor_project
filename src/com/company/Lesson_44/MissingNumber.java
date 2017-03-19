package com.company.Lesson_44;

import java.sql.Array;
import java.util.Arrays;

/**
 * Created by Pc on 12.03.2017.
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2,5};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                return i + 1;
            }
        }
        if (arr.length != arr[arr.length-1]){
            return arr[arr.length-1]+1;

        }
        return 0;
    }

}
