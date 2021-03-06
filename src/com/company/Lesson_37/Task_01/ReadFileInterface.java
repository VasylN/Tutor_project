package com.company.Lesson_37.Task_01;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Pc on 01.02.2017.
 *//* Последовательный вывод файлов
2. В статическом блоке считай 2 имени файла firstFileName и secondFileName.
3. Создать интерфейс ReadFileInterface, с методами:
 - void setFileName(String fullFileName);
 - String getFileContent();
 - void join() throws InterruptedException;
 - void start();
4. Создай нить ReadFileThread, которая реализует
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
public interface ReadFileInterface {
    void setFileName(String fullFileName);
    String getFileContent() throws IOException;
    void join() throws InterruptedException;
    void start();
}

