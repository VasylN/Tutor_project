package com.company.Lesson_02_if_else;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 14.09.2016.
 */
public class Test_02 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Umnozhenie: " + mnoz(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())));
        System.out.println("Delenie: " + dil(Double.parseDouble(reader.readLine()),Double.parseDouble(reader.readLine()) ));
        System.out.println("Convert: " + convert(Double.parseDouble(reader.readLine())));
        System.out.println("Procent: " + proc(Double.parseDouble(reader.readLine())));
    }

    public static int mnoz(int a, int b){
        return a*b;
    }

    public static double dil (double a, double b){
        return a/b;
    }

    public static double convert(double a )  {
        return a * 26.3;
    }

    public static double proc(double a) {
        return a*0.1 + a;
    }

}
