package com.company.Lesson_26_Static_bloc.Task_03;

/**
 * Created by Pc on 14.12.2016.
 */
public class Plane implements Flyable {
    public int getPasenger() {
        return pasenger;

    }

    private int pasenger;

    public Plane(int pasenger) {
        this.pasenger = pasenger;
    }

    @Override
    public String toString() {
        return fly() + " with " + getPasenger();
    }

    @Override
    public String fly() {
        return "Plane is flying";
    }
}
