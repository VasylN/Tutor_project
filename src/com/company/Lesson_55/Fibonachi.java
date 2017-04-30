package com.company.Lesson_55;

/**
 * Created by Pc on 30.04.2017.
 */
public class Fibonachi {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(fibonachi(i));

    }

    public static int fibonachi(int i) {
        if (i <= 0)
            return 0;
        else if (i == 1)
            return 1;
        else if (i == 2)
            return 1;
        else return fibonachi(i - 1 )+ fibonachi(i- 2);
    }
}
