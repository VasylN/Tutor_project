package com.company.Lesson_02_if_else;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 14.09.2016.
 */
public class Test_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());


        if (number1 > number2 && number1 > number3) {
            System.out.println("Max is " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Max is " + number2);
        } else if (number3 > number2 && number3 > number1) {
            System.out.println("Max is " + number3);
        }
    }
}
