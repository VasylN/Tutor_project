package com.company.Lesson_12_Arrays_sort_bubble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Pc on 19.10.2016.
 *//* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           list.add(Integer.parseInt(reader.readLine()));
        }return list;
    }
    public static int getMinimum(List<Integer> listNew){
//        int min = listNew.get(0);
//        for (int i = 0; i <listNew.size() ; i++) {
//            if(listNew.get(i) < min){
//                min = listNew.get(i);
//            }
//        }

       // int min = Collections.max(listNew);
        return Collections.min(listNew);
    }
}
