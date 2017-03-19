package com.company.Lesson_26_Static_bloc.Task_03;

/**
 * Created by Pc on 14.12.2016.
 */
public class Helicopter implements Flyable {
    private int pasenger;


    public Helicopter(int pasenger) {
        this.pasenger = pasenger;
    }


    @Override
    public String toString() {
        return fly() + " with " + getPasenger();
    }

    public int getPasenger() {
        return pasenger;
    }

    @Override
    public String fly() {
        return "Helicopter is flying";
    }
}
