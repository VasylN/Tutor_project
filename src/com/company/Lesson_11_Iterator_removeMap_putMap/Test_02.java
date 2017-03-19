package com.company.Lesson_11_Iterator_removeMap_putMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Pc on 16.10.2016.
 */
/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Map<String, Integer> map = createMap();
        searchMonth(s, map);
    }

    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();

        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);

        return map;
    }

    public static void searchMonth(String s, Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().contains(s)) System.out.println(entry.getKey() + " is " + entry.getValue() + " month.");
        }

    }
}

