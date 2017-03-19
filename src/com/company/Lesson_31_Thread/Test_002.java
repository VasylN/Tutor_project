package com.company.Lesson_31_Thread;

/**
 * Created by Pc on 08.01.2017.
 */
public class Test_002 {

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread thread = new Thread(clock);
        thread.start();

        Thread.sleep(5000);
        thread.interrupt(); // interrupt();
    }

    private static class Clock implements Runnable{
        // private static boolean isCancel = false; // isInterrupted

       /* void cancel(){
            isCancel = true;
        }
*/
        @Override
        public void run() {
            while(!Thread.currentThread().isInterrupted()) { // Thread.currentThread().isInterrupted();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tik");

            }
        }
    }
}
