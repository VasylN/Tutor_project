package com.company.Lesson_23_extends.Task_02;

/**
 * Created by Pc on 30.11.2016.
 */
public class Hrivna extends Money {
    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    String getCurrencyName() {
        return "HRN";
    }
}
