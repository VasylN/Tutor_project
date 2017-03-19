package com.company.Lesson_44;

/**
 * Created by Pc on 11.03.2017.
 */
public class Test_tests  {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int [] b = {10, 20, 30, 40};
        int v = 42;
        System.out.println(sumOfTwo(a,b,v));
    }
   public static boolean sumOfTwo(int[] a, int[] b, int v) {
        for(int x : a)
            for(int y : b)
                if(x+y == v)
                    return true;
        return false;

    }
}
