package com.company.Lesson_35.Task_01;

/**
 * Created by Pc on 25.01.2017.
 *//* Создание по образцу
1. В віполняющем классе создать статик переменную number = 5
1. Создать класс CountDownRunnable, сделать его таском
2. В классе CountDownRunnable:
- создать приватную переменную countIndexDown типа int и присвоить ей значение переменной number
- создать переменную private Thread t
- в конструкторе инициализировать переменную t нитью с таском класса CountDownRunnable и именем,
 которое приходит в параметрах конструктора. Запустить нить.
- переопределить toString(), что бы он выводил строки в следующем виде: t.getName() + ": " + countIndexDown;
- реализовать метод run(), он должен:
 -- пока переменная countIndexDown не равняется 0:
 -- выводить на экран toString()
 -- уменшать переменную countIndexDown на один
 -- отправлять нить в сон на пол секунды
По образу и подобию CountDownRunnable создай нить CountUpRunnable, которая выводит значения в нормальном порядке - от 1 до number
*/
public class Test_01 {
    static int number  = 5;

    public static void main(String[] args) throws InterruptedException {
        CountDownRunnable countDownRunnable = new CountDownRunnable("было");
        CountUpRunnable countUpRunnable = new CountUpRunnable("стало");

    }
}
