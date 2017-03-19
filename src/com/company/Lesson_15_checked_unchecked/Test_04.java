package com.company.Lesson_15_checked_unchecked;

/**
 * Created by Pc on 30.10.2016.
 *//* Перехват unchecked исключений
В методе processExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..
*/

public class Test_04 {
    public static void main(String[] args) {
        try {
            generation();
        } catch (NullPointerException | ArithmeticException | IndexOutOfBoundsException e){
            printStack(e);
        }

    }

    public static void printStack(Throwable t){
        System.out.println(t);
        for (StackTraceElement element : t.getStackTrace()) {
            System.out.println(element);
        }

    }
    public static void generation()  {

        int i = (int) (Math.random() * 3);
        if (i == 0) throw new NullPointerException();

        if (i == 1) {
            throw new ArithmeticException();
        }
        if (i == 2) {
            throw new IndexOutOfBoundsException();
        }
    }
}
