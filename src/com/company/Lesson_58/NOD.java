package com.company.Lesson_58;

/**
 * Created by Pc on 14.05.2017.
 */
public class NOD {
    public static void main(String[] args) {
        int i = 15;
        int j = 9;
        nod(i,j);
    }

    public static void nod(int i, int j) {
        int temp = 1;
        int temp1 = 1;
        while (temp <= i && temp <= j) {
            if (i % temp == 0 && j % temp == 0) {
                temp1 = temp;
                temp++;
            }else temp++;

        }
        System.out.println(temp1);
    }
}
