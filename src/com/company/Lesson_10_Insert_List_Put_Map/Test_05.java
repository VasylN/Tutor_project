package com.company.Lesson_10_Insert_List_Put_Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pc on 15.10.2016.
 */
/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/
public class Test_05 {
    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Simon"));
        System.out.println(getCountTheSameLastName(map, "Sim"));
    }

    public static Map createMap() {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Semenov", "Semen");
        stringMap.put("Antonov", "Simon");
        stringMap.put("Sim3", "Simon");
        stringMap.put("Sim1", "Simon");
        stringMap.put("Sim", "Sion");
        stringMap.put("Sim", "Ivan");
        return stringMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String s) {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (value.equals(s)) {
                count++;
            }
        }
        return count;

    }
    public static int getCountTheSameLastName(Map<String, String> map, String s1){
        int count = 0;
        for (Map.Entry<String, String> stringEntry : map.entrySet()) {
            String key = stringEntry.getKey();
            if(key.equals(s1)){
                count++;
            }
        }return count;
    }

}
