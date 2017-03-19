package com.company.Lesson_31_Thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 08.01.2017.
 */
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

       /* int max = 0;
        if (a > b) {
            max = a;
        } else if (b > a) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);*/
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else if (c > b && c > a) {
            System.out.println(c);
        }
    }
}
