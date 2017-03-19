package com.company.Lesson_01_metod_variable;

/**
 * Created by user on 11.09.2016.
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println(mnoz(15,10));
        System.out.println(dil(25,85));
        System.out.println(sum(85,98));
        System.out.println(vid(10,5));
    }


    public static int mnoz(int a, int b){
        return a * b;

    }

    public static double dil(double a, double b){
        return a / b;

    }

    public static int sum(int a, int b){
        return a + b;

    }

    public static int vid(int a, int b){
        return a - b;

    }

}
