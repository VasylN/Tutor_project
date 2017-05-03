package com.company.Lesson_55;

/**
 * Created by Pc on 30.04.2017.
 */
public class StringSort {
    public static void main(String[] args) {
        String [] mas = {"public", "static", "void", "main"};
       sort(mas);
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

    }

    public static void sort(String[] mas){
        for (int i = 0; i < mas.length-1; i++) {
            for (int j = 0; j < mas.length - 1; j++) {
                if (isGreater(mas[j], mas[j+1])){
                    String temp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = temp;
                }
            }

        }
    }
    public static boolean isGreater (String a, String b){
        return a.compareTo(b) > 0;

    }
}
