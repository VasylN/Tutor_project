package com.company.Lesson_02_if_else;

/**
 * Created by user on 11.09.2016.
 */
public class IfElseTest {
    public static void main(String[] args) {
        int a = 54;

        // == - сравнение двух чисел
        // < >
        // && - AND - true true  // І
        // || - OR - true  // або

        if(a > 50 && a < 100){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        int b = 0;

        if(b < 50 || b > 100){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
