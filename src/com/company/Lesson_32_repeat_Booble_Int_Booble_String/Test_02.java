package com.company.Lesson_32_repeat_Booble_Int_Booble_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 11.01.2017.
 */
public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = new String[5];
        for (int i = 0; i < s1.length; i++) {
            String s = reader.readLine();
            s1[i] = s;
        }
        sort(s1);
        for (String s : s1) {
            System.out.println(s);
        }
    }

    public static void sort(String s1[]) {
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1.length - 1; j++) {
                if(isGreaterThen(s1[j],s1[j+1])){
                    String temp = s1[j];
                    s1[j]= s1[j+1];
                    s1[j+1]=temp;
                }
            }
        }
    }

    public static boolean isGreaterThen(String a, String b){
        return a.compareTo(b) > 0;
    }
}
