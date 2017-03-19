package com.company.Lesson_24_extends_implements.Task_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 04.12.2016.
 *//* Статики
1. В статическом блоке считайте две переменные с консоли number1 и number2 с типом int.
2. Не забыть про IOException, который надо обработать в блоке catch.
3. Закрыть поток ввода методом close().
4. Создать метод min(int a, int b), который должен вернуть минимальное значение между number1 и number2.
5. Создать статическую, неизменяемую переменную MIN и присвоить ей значение, которое возвращает метод min.
6. В выполняющем методе вывести значение переменной MIN.
*/
public class TestStatic_02 {
    static int number1;
    static int number2;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            number1 = Integer.parseInt(reader.readLine());
            number2 = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(MIN);
    }



    public static int MIN = min(number1, number2);

    public static int min(int a, int b) {
        int min = 0;
        if (a < b) {
            min = a;
        } else if (b < a)
            min = b;

        return min;
    }
}
