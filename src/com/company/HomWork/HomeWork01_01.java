package com.company.HomWork;

/**
 * Реализуй метод public static void salary(int a).
 Метод должен увеличить переданное число на 100 и вывести на экран надпись:
 «Твоя зарплата составляет: a долларов в месяц.». Где a - это число, которое увеличили на 100.
 */
public class HomeWork01_01 {
    public static void main(String[] args)
    {
        salary(1000);
    }

    public static void salary(int a)
    {
        int b = a +100;
        System.out.println("Твоя зарплата составляет "+ b +" долларов в месяц.");
    }
}
