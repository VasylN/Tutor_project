package com.company.Lesson_09_Date;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pc on 12.10.2016.
 * /* HashMap из 10 пар
 Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
 арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст,
 жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
 Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 Пример вывода (тут показана только одна строка):
 картофель - клубень
 */

public class Test_04 {
    public static void main(String[] args) {
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("арбуз","ягода");
        stringMap.put("банан","трава");
        stringMap.put("вишня","ягода");
        stringMap.put("ирис","цветок");
        printMap(stringMap);

    }

    public static void printMap(Map<String,String> srringStringMap){
        for (Map.Entry<String, String> stringStringEntry : srringStringMap.entrySet()) {
            System.out.println(stringStringEntry.getKey() + " - " + stringStringEntry.getValue());
        }
    }
}
