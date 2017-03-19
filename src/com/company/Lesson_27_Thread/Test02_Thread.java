package com.company.Lesson_27_Thread;

/**
 * Created by Pc on 18.12.2016.
 */
public class Test02_Thread {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Printer printer1 = new Printer();
        printer.start();
        printer1.start();
    }

    public static class Printer extends Thread{
        @Override
        public void run() {
            System.out.println("Im printer");
        }
    }
}
