package com.company.Lesson_05_ArraysList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 25.09.2016.
 *//* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
public class Test_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int ar1[] = new int[20];
        int ar2[] = new int[10];
        int ar3[] = new int[10];

        for (int i = 0; i < ar1.length; i++) {
             ar1 [i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i <ar2.length ; i++) {
            ar2 [i] = ar1 [i];

        }

        int j = 0;
        for (int i = 10; i < ar1.length ; i++) {
            ar3 [j] = ar1[i];
            j++;
        }

        for (int i = 0; i < ar3.length; i++) {
            System.out.println(ar3[i]);
        }

    }
}
