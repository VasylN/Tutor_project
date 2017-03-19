package com.company.Lesson_14_LIFO_Exception;

/**
 * Created by Pc on 26.10.2016.
 *//* И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода,
 вызвавшего его, полученное с помощью StackTrace.
*/
public class Test_02 {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String element = stackTraceElements[2].getMethodName();
        System.out.println(element);
    }
    public static void method2(){
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String element = stackTraceElements[2].getMethodName();
        System.out.println(element);


    }
    public static void method3(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String element = stackTraceElements[2].getMethodName();
        System.out.println(element);

    }

}
