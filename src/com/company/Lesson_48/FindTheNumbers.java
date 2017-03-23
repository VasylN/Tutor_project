package com.company.Lesson_48;

import java.util.Arrays;

/**
 * Created by Pc on 22.03.2017.
 */
public class FindTheNumbers {
    public static void main(String[] args) {
     int [] ints =  {1, 3, 5, 6, 1, 4, 3, 6};
        for (int i : findTheNumbers(ints)) {
            System.out.println(i);
        }

    }
    public static int[] findTheNumbers(int[] a) {
        Arrays.sort(a);
        int mas [] = new int [2];
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] == a[i+1]){
               mas[count] = a[i];
                count++;

            }
        }

        return mas;
    }


}
