package com.company.Lesson_14_LIFO_Exception;

/**
 * Created by Pc on 26.10.2016.
 *//* Метод должен возвращать результат – глубину его стек-трейса
Написать метод, который возвращает результат – глубину его стек трейса –
 количество методов в нем (количество элементов в списке). Это же число метод должен выводить на экран.
*/
public class Test_04 {
    public static int getStacKDeep() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int countDeep = 0;
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            countDeep++;
        }
        return countDeep;
    }
}
