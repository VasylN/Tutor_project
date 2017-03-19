package com.company.Lesson_24_extends_implements.Task_02;

/**
 * Created by Pc on 04.12.2016.
 */
public class BodyPart implements Alive {
    private String name;


    public BodyPart(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return containsBones().equals("Yes") ? name + " содержит кости" : name + " не содержит кости";
    }

    @Override
    public Object containsBones() {
        return "Yes";
    }
}
