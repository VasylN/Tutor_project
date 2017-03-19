package com.company.Lesson_12_Arrays_sort_bubble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pc on 19.10.2016.
 */
/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным городом.
 Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/
//додати 2 метода
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String> stringMap  = new HashMap<>();
        while (true){
            String city1 = reader.readLine();
            if (city1.isEmpty()) break;
            String lastName = reader.readLine();
            stringMap.put(city1, lastName);

        }
        String city = reader.readLine();
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            if(entry.getKey().equals(city) ) {
                System.out.println(entry.getValue());
            }
        }
    }

}























