package com.company.Lesson_23_extends.Task_03;

/**
 * Created by Pc on 30.11.2016.
 */
public class Dragon extends BigAnimal{
    @Override
    public String getSize() {
        return "Дракон большой, " + super.getSize();
    }
}
