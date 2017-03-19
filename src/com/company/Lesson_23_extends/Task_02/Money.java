package com.company.Lesson_23_extends.Task_02;

/**
 * Created by Pc on 30.11.2016.
 */
public abstract class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    double getAmount(){
          return amount;

      }
      abstract String getCurrencyName();
}
