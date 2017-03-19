package com.company.Lesson_27_Thread;

/**
 * Created by Pc on 18.12.2016.
 */
public class Test01_Thread {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread childThread = new Thread(printer);
        Thread childThread1 = new Thread(printer);
        Thread childThread2 = new Thread(printer);
        childThread.start();
        childThread1.start();
        childThread2.start();
    }

    public static class Printer implements Runnable {

        @Override
        public void run() {
            System.out.println("Im printer");
        }
    }

    /**
     * Created by Pc on 18.12.2016.
     */
    public static class Test_06 {
    }
}
