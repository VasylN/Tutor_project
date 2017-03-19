package com.company.Lesson_27_Thread.Task_01;

import java.util.Date;

/**
 * Created by Pc on 18.12.2016.
 */
public class Violin implements MusicalInstrument {
    private String musician;

    public Violin(String musician) {
        this.musician = musician;
    }

    @Override
    public Date startPlaying() {
        return new Date();
    }

    @Override
    public Date stopPlaying() {
        return new Date();
    }

    @Override
    public void run() {
        Date startDate = startPlaying();
        Test_06.sleepNSeconds(4);
        Date endDate = stopPlaying();

        System.out.println("Playing " + (endDate.getTime() - startDate.getTime()) + " ms");

    }
}
