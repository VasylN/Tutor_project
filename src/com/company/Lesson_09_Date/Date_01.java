package com.company.Lesson_09_Date;

import java.util.Date;

/**
 * Created by Pc on 12.10.2016.
 */
public class Date_01 {
    public static void main(String[] args) throws InterruptedException {
        Date date1 = new Date();
        Thread.sleep(5000);
        Date date2 = new Date();

        long msDelay = date2.getTime() - date1.getTime();
        System.out.println(msDelay);
    }
}
