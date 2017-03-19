package com.company.Lesson_37.Task_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 01.02.2017.
 *//* Последовательный вывод файлов
2. В статическом блоке считай 2 имени файла firstFileName и secondFileName.
3. Создать интерфейс ReadFileInterface, с методами:
 - void setFileName(String fullFileName);
 - String getFileContent();
 - void join() throws InterruptedException;
 - void start();
4. Создай нить ReadFileInterface, которая реализует
интерфейс ReadFileInterface (Подумай, что больше подходит - Thread или Runnable).
3.1. Метод setFileName должен устанавливать имя файла, из которого будет читаться содержимое.
3.2. Метод getFileContent должен возвращать содержимое файла.
3.3. В методе run считай содержимое файла, закрой поток. Раздели пробелом строки файла.
4. В выполняющем классе создать метод systemOutPrintln(String fileName), он должен:
 - создавать таск ReadFileInterface
 - зассетить имя файла, с которым работает таск
 - запустить таск методом start интерфейса ReadFileInterface
 - ожидать завершение таска
 - вывести в консоль содержимое файла, использовать соответсвующий метод
5. В выполняющем методе вызвать метод systemOutPrintln для двух разных файлов
Ожидаемый вывод:
[все тело первого файла]
[все тело второго файла]
*/
public class Test_01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static String firstFileName;
    static String secondFileName;

    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();


        }
    }
    public static void systemOutPrintln (String fileName) throws IOException, InterruptedException {
        ReadFileInterface file = new ReadFileThread();
        file.setFileName(fileName);
        file.start();
        file.join();
        System.out.println(file.getFileContent());
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }
}

