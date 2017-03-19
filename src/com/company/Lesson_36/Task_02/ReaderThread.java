package com.company.Lesson_36.Task_02;

import com.sun.org.apache.regexp.internal.RE;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 29.01.2017.
 *//*
1. В выполняющем классе создать BufferedReader
2. В выполняющем классе создать статик переменную byte countReadStrings
3. Создать класс ReaderThread, сделать его нитью
3.0  Нить должна запускаться сразу при создании
3.1. Каждая нить должна читать с консоли слова. Используйте BufferedReader reader.
3.2. Используй static byte countReadStrings, чтобы посчитать, сколько слов уже считано с консоли всеми нитями.
3.3 Реализуйте логику метода run:
3.4. Пока нить не прервана (!isInterrupted) читайте с консоли слова и добавляйте их в поле List<String> result.
3.5. Используй countReadStrings для подсчета уже считанных с консоли слов.
3.6 Переопределить метод toString(), он должен выводить значение result у текущей нити
4. В выполняющем методе создать переменную int count (к-во строк, которые необходимо ввести всем нитям),
 присвоить ей значение введенное с консоли
4.1 В выполняющем методе создать 3 нити
4.2 Нити должны работать, пока count > countReadStrings, после этого остановить все дочерние нити
4.3 Вывести значение каждой нити на экран в виде: "#1:" + нить
*/
public class ReaderThread extends Thread {
    List<String> result = new ArrayList<>();

    public ReaderThread() {
        start();
    }

    @Override
    public String toString() {
        return result.toString();
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                String s = Test_01.reader.readLine();
                result.add(s);
                Test_01.countReadStrings++;
                System.out.println(Test_01.countReadStrings);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
