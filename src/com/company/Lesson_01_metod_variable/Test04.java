package com.company.Lesson_01_metod_variable;

/**
 * Created by user on 11.09.2016.
 */
// 1 - convert
    // 2 - procent
    // 3 - print4
public class Test04 {

    public static void main(String[] args) {
        System.out.println(convert(10));
        System.out.println(procent(5));
        print4("nnmnmnnm");
    }

    public static double convert(double a )  {
        return a * 26.3;

    }

    public static double procent ( double b){
        return b + b*0.1;

    }


    public static void print4( String s){
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}
