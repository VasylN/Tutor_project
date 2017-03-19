package com.company.Lesson_02_if_else;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 14.09.2016.
 */
public class Test_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();
        System.out.println("Name one is " + s1);
        System.out.println("Name two is " + s2);

        String s3 = reader.readLine();
        int number = Integer.parseInt(s3);
        int number1 = Integer.parseInt(reader.readLine());  //аналогічний
        System.out.println("Number one is " + number );
        System.out.println("Number two is " + number1);


    }
}
