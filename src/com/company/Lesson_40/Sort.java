package com.company.Lesson_40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 15.02.2017.
 */
public class Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strings [] = new String[5];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
        }
        sort(strings);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    static public void sort(String[] strings){
        for (int i = 0; i <strings.length; i++) {
            for (int j = 0; j < strings.length - 1 ; j++) {
                if (isGreaterThen(strings[j], strings[j+1])){
                    String temp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1]= temp;
                }
            }

        }
    }
    public static boolean isGreaterThen(String a, String b){
        return a.compareTo(b)>0;
    }

}

