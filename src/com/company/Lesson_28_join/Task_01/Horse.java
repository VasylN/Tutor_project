package com.company.Lesson_28_join.Task_01;

/**
 * Created by Pc on 21.12.2016.
 */
public class Horse extends Thread {
    public Horse(String name) {
        super(name);

    }


    private boolean isFinished;

    public boolean isFinished() {
        return isFinished;

    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            if (i == 1000) {
                System.out.println(getName() + " has finished the race!");
                isFinished = true;
            }
        }
    }
}
