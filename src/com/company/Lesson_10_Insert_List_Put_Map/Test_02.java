package com.company.Lesson_10_Insert_List_Put_Map;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Pc on 15.10.2016.
 */
/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/
public class Test_02 {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new LinkedList()));
        System.out.println(getTimeMsOfInsert(new ArrayList()));

    }
    public static void insert10000(List list){
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
    public static long getTimeMsOfInsert(List list){
        Date startTime = new Date();
        insert10000(list);
        Date date = new Date();
        long distanceMs = date.getTime() - startTime.getTime();
        return distanceMs;
    }
}
