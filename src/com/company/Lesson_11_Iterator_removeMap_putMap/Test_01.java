package com.company.Lesson_11_Iterator_removeMap_putMap;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Pc on 16.10.2016.
 *//* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: //createMap
 «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом. // removeAllSummerPeople
*/
public class Test_01 {
    public static void main(String[] args) {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map);
    }

    public static Map<String, Date> createMap() {
        Map<String, Date> resulte = new HashMap<>();

        resulte.put("Semenov", new Date("JUNE 1 1980")); //JULY AUGUST DECEMBER MARCH
        resulte.put("Ivanov", new Date("JULY 4 1888"));
        resulte.put("Ivadfov", new Date("AUGUST 4 1878"));
        resulte.put("Semen", new Date("DECEMBER 4 1878"));

        return resulte;
    }

    public static void removeAllSummerPeople(Map map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            int month = iterator.next().getValue().getMonth() + 1;
            if (month >= 6 && month <= 8) iterator.remove();
        }
    }
}
