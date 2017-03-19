package com.company.Lesson_44;

/**
 * Created by Pc on 05.03.2017.
 */
public class Test_02 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int [] b = {10, 20, 30, 40};
        int v = 42;
        System.out.println(sumOfTwo(a,b,v));

    }

    static boolean sumOfTwo(int[] a, int[] b, int v) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] + b[j] == v) {
                    return true;

                }
            }
        }
        return false;
    }
}







