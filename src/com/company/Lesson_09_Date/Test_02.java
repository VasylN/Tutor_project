package com.company.Lesson_09_Date;

/**
 * Created by Pc on 12.10.2016.
 * /* Вывести на экран список ключей
 Создайте коллекцию HashMap<String, String>, туда занесите 10 различных строк.
 Вывести на экран список ключей, каждый элемент с новой строки.
 */

import java.util.HashMap;
import java.util.Map;

public class Test_02 {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("a", "b");
        stringMap.put("c", "d");
        stringMap.put("k", "d");
        stringMap.put("f", "h");
        stringMap.put("a", "m");

        /*Iterator<Map.Entry<String,String>> iterator = stringMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            System.out.println(key);
        }*/

        for (Map.Entry<String, String> stringStringEntry : stringMap.entrySet()) {
            System.out.println(stringStringEntry.getKey());
        }

    }
}
