package com.company.Lesson_31_Thread.Task_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 08.01.2017.
 *//* Считаем секунды
1. Создать класс Stopwatch, унаследовать его от Thread.
2. В выполняющем классе ввести с клавиатуры строку
3. Напиши реализацию метода run в нити Stopwatch (секундомер).
4. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
5. Выведи количество секунд в консоль.
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        Stopwatch thread = new Stopwatch();
        thread.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        thread.interrupt();


    }
}
