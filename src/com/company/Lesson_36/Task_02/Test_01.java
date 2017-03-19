package com.company.Lesson_36.Task_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
public class Test_01 {
    static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static volatile byte countReadStrings;

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number of threads");
        int count = Integer.parseInt(reader.readLine());
        ReaderThread thread1 = new ReaderThread();
        ReaderThread thread2 = new ReaderThread();
        ReaderThread thread3 = new ReaderThread();
        while (count > countReadStrings) {
        }
        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();
        System.out.println("#1:" + thread1);
        System.out.println("#2:" + thread2);
        System.out.println("#3" + thread3);
        reader.close();
    }
}
