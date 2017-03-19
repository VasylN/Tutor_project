package com.company.Lesson_35.Task_01;

/**
 * Created by Pc on 25.01.2017.
 */
public class CountUpRunnable implements Runnable {
    private int countUpRunnable = 1;
    private Thread t;

    @Override
    public String toString() {
        return t.getName() + ": " + countUpRunnable;
    }

    public CountUpRunnable(String name) throws InterruptedException {
        this.t = new Thread(this, name);
        t.start();
        t.join();
    }


    @Override
    public void run() {

        while (countUpRunnable != 6){
            System.out.println(this);
            countUpRunnable++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
