package com.company.Lesson_37;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Pc on 01.02.2017.
 *//* Только по-очереди!
1. Создать нить Read3Strings унаследовавшись от Thread.
2. В методе run реализовать чтение с консоли трех строк.
3. Три подряд введенных строки должны считываться в одной нити и объединяться в одну строку через пробел.
4. В методе main создать 2 нити, запустить каждую, вывести результат для каждой нити.

Пример:
Входные данные
a
b
c
d
e
f
Выходные данные:
a b c
d e f
*/
public class Test_01 {
   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings read3Strings = new Read3Strings();
       // read3Strings.start();
        read3Strings.join();
        Read3Strings read3Strings2 = new Read3Strings();
        //read3Strings2.start();
        read3Strings2.join();
        System.out.println(read3Strings.toString());
        System.out.println(read3Strings2.toString());

    }
}
