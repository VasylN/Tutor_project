package com.company.Lesson_14_LIFO_Exception;

/**
 * Created by Pc on 26.10.2016.
 *//* Метод должен вернуть номер строки кода, из которого вызвали этот метод
Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер
строки кода, из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
*/
public class Test_03 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int element = stackTraceElements[2].getLineNumber();
        System.out.println(element);
    }

    public static void method2(){
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int element = stackTraceElements[2].getLineNumber();
        System.out.println(element);
    }

    public static void method3(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int element = stackTraceElements[2].getLineNumber();
        System.out.println(element);

    }

}
