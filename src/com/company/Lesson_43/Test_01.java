package com.company.Lesson_43;

/**
 * Created by Pc on 01.03.2017.
 */
public class Test_01 {
    public static void main(String[] args) {
        String s1 = "text";
        String s2 = new String("text");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
