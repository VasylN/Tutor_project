package com.company.Lesson_23_extends.Task_02;

/**
 * Created by Pc on 30.11.2016.
 */
public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    String getCurrencyName() {
        return "usd";
    }
}
