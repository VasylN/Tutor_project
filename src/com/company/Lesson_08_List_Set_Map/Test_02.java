package com.company.Lesson_08_List_Set_Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 05.10.2016.
 *//* Максимальное и минимальное числа в массиве
Создать массив на 10 чисел. Заполнить его числами с клавиатуры.
 Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[5];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        int max = mas[0];
        int min = mas[0];

        for (int i = 0; i < mas.length ; i++) {
            if (mas [i] > max )
                max = mas[i];
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas [i] > min)
                min = mas[i];
        }
        System.out.println(max + " " + min );
    }
}
