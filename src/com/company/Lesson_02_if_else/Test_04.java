package com.company.Lesson_02_if_else;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 14.09.2016.
 */
public class Test_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        int temp = 0;
        if (number1 > number2) {
            temp = number1;
        } else {
            temp = number2;
        }

        if (temp < number3) {

            System.out.println("Max number is..  " + number3);

        } else {
            System.out.println("Max number is..  " + temp);
        }

    }
}
