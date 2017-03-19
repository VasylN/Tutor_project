package com.company.Lesson_10_Insert_List_Put_Map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Pc on 15.10.2016.
 * /* Провести 10 тысяч вставок, удалений
 Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
 */

public class Test_01 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        List linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);




    }

    public static void insert10000(List list){
        for (int i = 0; i <list.size(); i++) {
            list.add(i, new Object());
        }
    }

    public static void get10000(List list){
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }
    public static void set10000(List list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, new Object());
        }
    }
    public static void remove10000(List list){
        for (int i = 0; i < list.size(); i++) {
            list.remove(0);
        }
    }
}
