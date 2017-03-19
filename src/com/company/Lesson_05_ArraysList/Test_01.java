package com.company.Lesson_05_ArraysList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 25.09.2016.
 */
/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        int[] ar = initialyzeArray();
        System.out.println(max(ar));
    }

    public static int[] initialyzeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = Integer.parseInt(reader.readLine());
        }

        return arr;
    }

    public static int max(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i] ){
                max = array[i];
            }
        }
        return max;
    }

}
