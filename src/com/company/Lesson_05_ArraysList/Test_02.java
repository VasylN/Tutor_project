package com.company.Lesson_05_ArraysList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 25.09.2016.
 */
/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {
        String st []  = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < st.length-2 ; i++) {
            st[i] = reader.readLine();



        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(st[i]);
        }
    }
}
