package com.company.Lesson_51.Test_01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pc on 09.04.2017.
 *//* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.

map.put("Rooney", "Leo");
map.put("Lloris", "Hugo");
map.put("Messi", "Leo");
map.put("Ronaldo", "Cristiano");
map.put("Maldini", "Paolo");
map.put("Indzaghi", "Pipo");
map.put("Del Piero", "Alesandro");
map.put("Balotelli", "Mario");
map.put("Gotze", "Mario");
map.put("Gomez", "Mario");
*/
public class Test_01 {
    public static void main(String[] args) {
        System.out.println(removeNameDuplicate(addMap()));
    }

    public static Map addMap(){
        Map<String,String> map = new HashMap<>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
        return map;

    }
    public static Map <String,String> removeNameDuplicate (Map<String, String> map ){
        Map<String, String> newMap = new HashMap<>();
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int count = 0;
            for (String value : map.values() ) {
                if(entry.getValue().equals(value)){
                    count++;
                }
            }

            if(count > 1){
            } else {
                newMap.put(entry.getKey(), entry.getValue());
            }

        }

        return newMap;
    }

}
