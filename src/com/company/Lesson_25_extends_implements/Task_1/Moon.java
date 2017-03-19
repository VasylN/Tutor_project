package com.company.Lesson_25_extends_implements.Task_1;

/**
 * Created by Pc on 11.12.2016.
 */
public class Moon implements Planet {
    private Moon(){

    }
    private static Moon instance;
    public static Moon getInstance(){
        if(instance == null){
            instance = new Moon();
        }
        return instance;
    }
}
