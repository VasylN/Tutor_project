package com.company.Lesson_27_Thread.Task_01;

import java.util.Date;

/**
 * Created by Pc on 18.12.2016.
 */
public interface MusicalInstrument extends Runnable  {
    Date startPlaying();
    Date stopPlaying();

    @Override
    void run();
}
