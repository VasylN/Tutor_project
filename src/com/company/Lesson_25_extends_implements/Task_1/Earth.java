package com.company.Lesson_25_extends_implements.Task_1;

/**
 * Created by Pc on 11.12.2016.
 */
public class Earth implements Planet {
   private Earth() {

    }
    private static Earth instance;

    public static Earth getInstance() {
        if(instance == null){
            instance = new Earth();
        }
        return instance;
    }
}
