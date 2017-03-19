package com.company.Lesson_07_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 02.10.2016.
 */
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list_in = new ArrayList<>();


        while(true){
            String a = reader.readLine();
            if(a.equals("exit")) break; // contains
            list_in.add(a);
        }

    }
}
