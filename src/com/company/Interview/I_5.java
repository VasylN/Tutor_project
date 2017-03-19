package com.company.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 20.11.2016.
 */
public class I_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int f = Integer.parseInt(reader.readLine());
        System.out.println(faktorial(f));

    }
    public static int faktorial(int f){
        int temp = 1;
        for (int i = 1; i <= f; i++) {
            temp = temp *  i;
        }
        return temp;
    }
}
