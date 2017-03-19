package com.company.Lesson_10_Insert_List_Put_Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Pc on 15.10.2016.
 */
/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 10 различных чисел.
Удалить из множества все числа больше 10.
*/
public class Test_04 {
    public static void main(String[] args) throws IOException {
        Set<Integer> set = createSet();
        set = removeAllNumberMoreThen10(set);
        for (Integer integer : set) {
            System.out.println(integer);
        }


    }
    public static Set createSet() throws IOException {
        Set<Integer> set = new HashSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            set.add(Integer.parseInt(reader.readLine()));
        }
        return set;

    }
    public static Set removeAllNumberMoreThen10(Set set){
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            if (iterator.next()> 10)
            iterator.remove();
        }
        return set;
    }
}
