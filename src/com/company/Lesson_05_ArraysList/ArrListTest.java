package com.company.Lesson_05_ArraysList;

import java.util.ArrayList;

/**
 * Created by Pc on 25.09.2016.
 */
public class ArrListTest {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(); // String[] arr = new String[-];
        int n = arr.size(); // int n = arr.length;
        arr.add("refew"); // arr[0] = "rfeniref";
        arr.add("ref");
        arr.add(0, "ref546"); // Вставка элемента в начало массива
        arr.add(0, "ref54egre");
        arr.add(1, "ref"); //Вставка элемента по индексу массива
        arr.add(15, "ref"); //Вставка элемента в середину массива
        arr.set(3, "fwefew");
        arr.remove(2); // Удаление элемента из массива (по индексу)

        System.out.println(arr.get(0)); // arr[0];


    }
}
