package com.company.Lesson_55;

/**
 * Created by Pc on 30.04.2017.
 */
public class NOD {
    public static void main(String[] args) {
        int i = 12;
        int j = 15;
        nod(i, j);
    }

    public static void nod(int i, int j) {
        int temp = 1;
        int temp1 = 0;
        while (temp <= i && temp <= j) {
            if (i % temp == 0 && j % temp == 0) {
                temp1 = temp;
                temp++;
            } else temp++;

        }
        System.out.println(temp1);
    }
}
