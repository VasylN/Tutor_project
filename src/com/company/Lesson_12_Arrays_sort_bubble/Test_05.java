package com.company.Lesson_12_Arrays_sort_bubble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Pc on 19.10.2016.
 *//* Пять наибольших чисел
Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Test_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] mas = new Integer [10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());

        }

        sort(mas);

        for (int i = 0; i < 5; i++) {
            System.out.println(mas[i]);
        }

    }
    private static void sortArray(int[] array){ // 45 2 17 6
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) { // 45 17 6 2
                if(array[i] < array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }

    public static void sort(Integer[] array){
        Arrays.sort(array, Collections.reverseOrder());
    }

}
