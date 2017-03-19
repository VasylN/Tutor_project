package com.company.Lesson_05_ArraysList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 25.09.2016.
 * ввести 10 строк с клавиатуры и вывести их на экран в обратном порядке
 */

public class Test_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> arr = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            String s = reader.readLine();
            arr.add(s);

        }

        for (int i = 0; i < arr.size(); i++) {
            int j = arr.size() - 1 - i;
            System.out.println(arr.get(j));
        }

    }
}
