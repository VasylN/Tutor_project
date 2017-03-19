package com.company.Lesson_27_Thread;

/**
 * Created by Pc on 18.12.2016.
 */
public class Test_06 {
    public static void main(String[] args) throws InterruptedException {
        Printer printer1 = new Printer();
        Thread childThread1 = new Thread(printer1);
        childThread1.start();
        childThread1.join();
    }

    public static class Printer implements Runnable{

        @Override
        public void run() {
            System.out.println("Printer");
        }
    }
}
