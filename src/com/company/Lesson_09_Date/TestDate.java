package com.company.Lesson_09_Date;

import java.util.Date;

/**
 * Created by Pc on 12.10.2016.
 */
public class TestDate {
    public static void main(String[] args)  {
        Date t = new Date();
        t.setHours(0);
        t.setYear(1950);
        t.setMonth(10);

        System.out.println(t);
    }
}
