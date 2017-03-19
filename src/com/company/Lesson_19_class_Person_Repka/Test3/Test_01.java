package com.company.Lesson_19_class_Person_Repka.Test3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Pc on 13.11.2016.
 *//* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(name));

        List<Integer> list = new ArrayList<>();
        String num = null;

        while((num = fileReader.readLine()) != null ){
            int number = Integer.parseInt(num);
            if(number%2 == 0){
                list.add(number);
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        for (Integer s : list) {
            System.out.println(s);
        }

    }

}

















