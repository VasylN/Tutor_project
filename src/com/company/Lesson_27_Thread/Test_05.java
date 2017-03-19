package com.company.Lesson_27_Thread;

/**
 * Created by Pc on 18.12.2016.
 *//* Вывод стек-трейса
1. Создать таск - класс public static SpecialThread - на основании интерфейса Runnable
2. SpecialThread должен выводить в консоль свой стек-трейс.

*/
public class Test_05 {
    public static void main(String[] args) {
        SpecialThread specialThread = new SpecialThread();
        Thread childThread = new Thread(specialThread);
        childThread.start();
    }
    public static class SpecialThread implements Runnable{

        @Override
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println("run " + element);
            }
        }
    }
}

