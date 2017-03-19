package com.company.Lesson_08_List_Set_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Pc on 05.10.2016.
 */
public class Test_05 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("first", "Test1");
        map.put("first2", "Test1");
        map.put("first5", "Test1");
        map.put("first3", "Test1");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }


    }
}
