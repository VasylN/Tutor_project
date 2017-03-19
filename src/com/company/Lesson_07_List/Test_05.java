package com.company.Lesson_07_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 02.10.2016.
 */
/*
 Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв,
строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/
public class Test_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            String a = reader.readLine();
            if (a.isEmpty()) break;
            list.add(a);

        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String x = list.get(i);

            if(x.length()%2==0){
                result.add(x + " " + x);
            }else{
                result.add(x + " " + x + " " + x );
            }

        }
        for (String x : result) {
            System.out.println(x);
        }
    }
}
