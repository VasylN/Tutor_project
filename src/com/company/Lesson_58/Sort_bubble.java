package com.company.Lesson_58;

import java.util.Arrays;

/**
 * Created by Pc on 14.05.2017.
 */
public class Sort_bubble {
    public static void main(String[] args) {
        int mas[] = {12,32,454,55,53,2,};
        sortBoublle(mas);
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
    public static void sortBoublle(int[]mas){
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - 1; j++) {
                if(mas[j]<mas[j+1]){
                    int temp = mas[j];
                    mas[j]= mas[j+1];
                    mas[j+1]=temp;

            }
        }
    }
}}
