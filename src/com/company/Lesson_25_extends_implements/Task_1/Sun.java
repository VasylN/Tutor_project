package com.company.Lesson_25_extends_implements.Task_1;

/**
 * Created by Pc on 11.12.2016.
 */
public class Sun implements Planet {
    private Sun() {
    }
    private static Sun instance;
    public static Sun getInstance(){
        if(instance == null){
            instance = new Sun();
        }
        return instance;
    }
}
