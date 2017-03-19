package com.company.Lesson_14_LIFO_Exception;

/**
 * Created by Pc on 26.10.2016.
 */
public class Test_07_Exception {
    public static void main(String[] args) {
        try{
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage() + e);
        }
        System.out.println();
    }
}
