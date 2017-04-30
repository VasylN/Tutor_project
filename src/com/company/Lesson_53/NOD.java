package com.company.Lesson_53;

/**
 * Created by Pc on 19.04.2017.
 */
public class NOD {
    public static void main(String[] args) {
        int i = 10;
        int j = 15;
        System.out.println(max(i,j));

    }

    public static int max(int i, int j) {
        int temp1 = 1;
        int temp2 = 1;
        while (temp1 <= i && temp1 <= j) {
            if (i % temp1 == 0 && j % temp1 == 0) {
                temp2 = temp1;
                    temp1++;
            } else temp1++;
        }
        return temp2;
    }
}

