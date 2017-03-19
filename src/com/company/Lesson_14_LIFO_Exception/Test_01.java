package com.company.Lesson_14_LIFO_Exception;

/**
 * Created by Pc on 26.10.2016.
 */// LIFO - last in first out
public class Test_01 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        method2();
    }
    public static void method2(){
        method3();
    }
    public static void method3(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
    }
}
