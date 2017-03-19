package com.company.Lesson_32_repeat_Booble_Int_Booble_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 11.01.2017.
 */// оздать массив на 5 чисел и отсортировать его в возрастающем порядке
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            int j = Integer.parseInt(reader.readLine());
            mas[i] = j;
        }
        sort(mas);
        for (int i : mas) {
            System.out.println(i);
        }
    }

    public static void sort(int[] mas1) {
        for (int i = 0; i < mas1.length - 1; i++) {
            for (int j = 0; j < mas1.length - 1 - i; j++) {
                if (mas1[j] > mas1[j + 1]) {
                    int temp = mas1[j];
                    mas1[j] = mas1[j + 1];
                    mas1[j + 1] = temp;
                }
            }
        }
    }

}
