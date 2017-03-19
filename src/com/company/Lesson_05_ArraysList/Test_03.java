package com.company.Lesson_05_ArraysList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 25.09.2016.
 */
/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // String st = reader.readLine();
        //int i = Integer.parseInt(reader.readLine());

        String [] str = new String[5];
        int i[] = new int[5];

        for (int j = 0; j < str.length; j++) {
            str [j] = reader.readLine();
        }


        for (int j = 0; j < i.length; j++) {
            i[j] = str[j].length();

        }
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }

    }

}
