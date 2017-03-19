package com.company.Lesson_10_Insert_List_Put_Map;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Pc on 15.10.2016.
 */
/* Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
*/
public class Test_03 {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(addList(new LinkedList())));
        System.out.println(getTimeMsOfGet(addList(new ArrayList())));

    }

    public static List addList(List list){
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static void getList(List list){
        int x = list.size() / 2;
        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }

    public static long getTimeMsOfGet(List list){
        Date startTime = new Date();
        getList(list);
        Date date = new Date();
        long distanceMs = date.getTime() - startTime.getTime();
        return distanceMs;
    }
}
