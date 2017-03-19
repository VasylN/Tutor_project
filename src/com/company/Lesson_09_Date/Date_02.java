package com.company.Lesson_09_Date;

import java.util.Date;

/**
 * Created by Pc on 12.10.2016.
 */
public class Date_02 {
    public static void main(String[] args) throws InterruptedException {
        Date startDate = new Date();

        long endTime = startDate.getTime() + 5000;
        Date endDate = new Date(endTime);

        Thread.sleep(3000);

        Date currentDate = new Date();

        if(currentDate.after(endDate)){
            System.out.println("End time! game over!");
        } else {
            System.out.println("You win! Go to the next level!");
        }
    }
}
