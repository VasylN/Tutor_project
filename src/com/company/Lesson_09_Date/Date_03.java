package com.company.Lesson_09_Date;

import java.util.Date;

/**
 * Created by Pc on 12.10.2016.
 */
public class Date_03 {
    public static void main(String[] args) {
        Date time = new Date();
        System.out.println(time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds());
    }
}
