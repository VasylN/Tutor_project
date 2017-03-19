package com.company.Lesson_40.Task_02;

/**
 * Created by Pc on 15.02.2017.
 *//*
1. Во вложеном классе создать статическую переменную countThreads = 10
2. Во вложеном классе создать статический массив testArray = new int[1000]
3. В статическом блоке заполнить массив значениями от 0 до 999
2. Создай нить SortThread, которая в методе run отсортирует статический массив testArray используя метод sort
*/
public class Test_01 {
    static int testArray [] = new int[1000];

    static {
        for (int i = 0; i < 1000; i++) {
            testArray[i] = i;
        }
    }



    public static void main(String[] args) {
        SortThread sortThread = new SortThread();
        sortThread.start();


    }
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array [j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

}
