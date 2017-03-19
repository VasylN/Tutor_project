package com.company.Lesson_04_Arrays_masyv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 21.09.2016.
 */
public class Test_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] s = new String[10];

        for (int i = 0; i < s.length ; i++) {
            s [i] = reader.readLine();
        }

        int[] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i]= Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + s[i]);
        }

    }
}
