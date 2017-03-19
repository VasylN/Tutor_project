package com.company.Lesson_34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 18.01.2017.
 */
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        System.out.println(factorial(a));
    }

    public static int factorial(int a) {
        int temp = 1;
        for (int i = 1; i <= a; i++) {
            temp = temp * i;
        }
        return temp;

    }
}
