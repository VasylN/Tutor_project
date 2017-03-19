package com.company.Lesson_32_repeat_Booble_Int_Booble_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 11.01.2017.
 */  /* Задача по алгоритмам
        Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
        Пример ввода:
        Вишня
        1
        Боб
        3
        Яблоко
        2
        0
        Арбуз
        Пример вывода:
        Арбуз
        3
        Боб
        2
        Вишня
        1
        0
        Яблоко
        */
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            } else {
                list.add(s);
            }
        }
        String[] array = list.toArray(new String[list.size()]);
        sort(array);
       /* for (String s : array) {
            System.out.println(s);
        }*/
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sort(String[] mas) {
            for (int i = 0; i < mas.length; i++) {
                if (isNumber(mas[i])) {
                    for (int j = 0; j < mas.length; j++) {
                        if (isNumber(mas[j])) {
                            int a = Integer.parseInt(mas[i]);
                            int b = Integer.parseInt(mas[j]);
                            if (a > b) {
                                String temp = mas[i];
                                mas[i]= mas[j];
                                mas[j]= temp;
                            }
                        }
                    }
                } else {
                    for (int j = 0; j < mas.length; j++) {
                        if (!isNumber(mas[j])) {
                            if (isGreaterThen(mas[i], mas[j])) {
                                String temp = mas[i];
                                mas[i] = mas[j];
                                mas[j] = temp;
                            }
                        }
                    }
                }

            }
        }




    public static boolean isNumber(String t) {
        try {
            Integer.parseInt(t);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isGreaterThen(String a, String b) {
        return a.compareTo(b) > 0;
    }

}
