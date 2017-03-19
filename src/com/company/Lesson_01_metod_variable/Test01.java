package com.company.Lesson_01_metod_variable;

/**
 * Created by user on 11.09.2016.
 */
// int a = 5; int b = 7; int c = 2;
    // a = 7; b = 2; c = 5;
public class Test01 {
    public static void main(String[] args) {
         int a = 5;
         int b = 7;
         int c = 2;

        int temp = a; //5
        a = b; //7
        b = c;
        c = temp;

        System.out.print(a + " " + b + " " + " " + c);

        int d = 7;
        int i = 9;

        int t = d;
        d = i;
        i = t;
    }
}
