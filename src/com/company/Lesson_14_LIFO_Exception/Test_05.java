package com.company.Lesson_14_LIFO_Exception;

/**
 * Created by Pc on 26.10.2016.
 *//* Стек-трейс длиной 10 вызовов
Напиши код, чтобы получить стек-трейс длиной 10 вызовов.
*/

public class Test_05 {
    public static void main(String[] args) {
        method1();

    }

    public static void method1(){
        method2();
    }
    public static void method2(){
        method3();
    }

    public static int method3(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int countDeep = 0;
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            countDeep++;

        }
        System.out.println(countDeep);
        return countDeep;
    }
}
