package com.company.Lesson_02_if_else;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 14.09.2016.
 */
public class BufRead {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name12 = reader.readLine();
        System.out.println("Name is " + name1 + " " + name12);

        String s = reader.readLine(); // "56"
        int number1 = Integer.parseInt(s); // 56
        System.out.println("Number is " + number1*number1);
        System.out.println(s.length());

        int number2 = Integer.parseInt(reader.readLine());
        System.out.println("Number 2 = " + number2);
    }
}
