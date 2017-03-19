package com.company.Lesson_27_Thread;

/**
 * Created by Pc on 18.12.2016.
 *//* My first thread
Создать public static class TestThread - нить с помощью интерфейса Runnable.
TestThread должен выводить в консоль "My first thread".
*/
public class Test_03 {
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        Thread childThread = new Thread(testThread);
        childThread.start();
    }
    public static class TestThread implements Runnable{

        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
}
