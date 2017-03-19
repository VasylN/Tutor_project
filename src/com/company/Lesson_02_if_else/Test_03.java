package com.company.Lesson_02_if_else;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 14.09.2016.
 */
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());

        if (number1>number2){
            System.out.println(number2);
        }else if(number1<number2){
            System.out.println(number1);
        }else if(number1==number2){
            System.out.println("Число 1 рівне числу 2 ");
        }

    }
}
