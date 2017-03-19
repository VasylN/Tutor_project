package com.company.HomWork.Kostin;

/**
 * Created by Pc on 23.09.2016.
 */

/*Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
        а затем этот же массив выведите на экран тоже в строку,
        но в обратном порядке (99 97 95 93 … 7 5 3 1).*/

public class Hw_02 {
    public static void main(String[] args) {
            int ar[] = new int[50];
        int j = 0;
        for (int i = 1; i <= ar.length * 2 ; i+=2) {
            ar [j]= i;
            j++;
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < ar.length; i++) {

        }
    }
}
