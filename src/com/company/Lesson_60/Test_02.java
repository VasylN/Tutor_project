package com.company.Lesson_60;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pc on 21.05.2017.
 *//* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.

*/
public class Test_02 {
    public static void main(String[] args) {
        Map<String, String> map = stringMap();
        map = removeName(map);
        System.out.println(map);


    }
    public static Map<String,String> stringMap(){
        Map<String,String> map = new HashMap<>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");//
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");//
        map.put("Maldini", "Paolo");//
        map.put("Indzaghi", "Pipo");//
        map.put("Del Piero", "Alesandro");//
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
        return map;
    }
    public static Map<String,String> removeName(Map<String,String> map){
        Map<String,String> newMap = new HashMap<>();
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            int count = 0;
            for (Map.Entry<String, String> stringEntry : map.entrySet()) {

                if(stringStringEntry.getValue().equals(stringEntry.getValue())){
                    count++;
                   map.put(stringEntry.getKey(),stringEntry.getValue());

                }else if (count>1){
                    map.put(stringEntry.getKey(),stringEntry.getValue());
                }

            }
        }
        return newMap;
    }

}
