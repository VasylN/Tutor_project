package com.company.Lesson_37;

import java.io.BufferedReader;
import java.io.IOException;
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
public class Read3Strings extends Thread {

    String s1;
    String s2;
    String s3;

    public Read3Strings() {
        start();
    }

    @Override
    public void run() {
        try {
            s1 = Test_01.reader.readLine();
            s2 = Test_01.reader.readLine();
            s3 = Test_01.reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return (s1 + " " + s2 + " " + s3);
    }
}
