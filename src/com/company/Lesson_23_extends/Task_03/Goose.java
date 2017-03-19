package com.company.Lesson_23_extends.Task_03;

/**
 * Created by Pc on 30.11.2016.
 */
public class Goose extends SmallAnimal {
    @Override
    String getSize() {
        return "Гусь маленький, " + super.getSize();
    }
}
