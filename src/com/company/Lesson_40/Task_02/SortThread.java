package com.company.Lesson_40.Task_02;

import com.company.Lesson_01_metod_variable.Test01;

/**
 * Created by Pc on 15.02.2017.
 *//*
1. Во вложеном классе создать статическую переменную countThreads = 10
2. Во вложеном классе создать статический массив testArray = new int[1000]
3. В статическом блоке заполнить массив значениями от 0 до 999
2. Создай нить SortThread, которая в методе run отсортирует статический массив testArray используя метод sort
*/
public class SortThread extends Thread {
    @Override
    public void run() {
        Test_01.sort(Test_01.testArray);
        for (int i = 0; i < Test_01.testArray.length; i++) {
            System.out.println(Test_01.testArray[i]);
        }

    }
}
