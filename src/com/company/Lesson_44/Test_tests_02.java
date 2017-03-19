package com.company.Lesson_44;

import java.io.IOException;

/**
 * Created by Pc on 12.03.2017.
 */
public class Test_tests_02 {

    public static void main(String[] args) throws IOException {

        System.out.println(reverseInteger(-7890));
    }

   /* public static String reverseInteger(int x) throws IOException {
        String s = String.valueOf(x);
        return new StringBuffer(s).reverse().toString();

    }*/

    public static int reverseInteger(int x) throws IOException {
        int revers = 0;
        for (int i = x; i != 0; i = i / 10) {
            revers = revers*10 + i%10;
        }
        return revers;

    }
}
