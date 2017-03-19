package com.company.Lesson_09_Date;

/**
 * Created by Pc on 12.10.2016.
 * /* Вывести на экран список значений
 Создайте коллекцию HashMap<String, String>, туда занесите 5 различных строк.
 Вывести на экран список значений, каждый элемент с новой строки.
 */

import java.util.HashMap;
import java.util.Map;
public class Test_03 {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("a", "b");
        stringMap.put("c", "d");
        stringMap.put("k", "d");
        stringMap.put("f", "h");
        stringMap.put("a", "m");
        printValue(stringMap);
    }

    public static void printValue(Map<String,String> stringStringMap){
        for (Map.Entry<String, String> entry : stringStringMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
