package com.company.Lesson_57;

/**
 * Created by Pc on 10.05.2017.
 */
public class Test_01 {
    public static void main(String[] args) {
        String[] strings = {"public", "static", "void", "main"};
        sort(strings);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public static void sort(String[] strings) {
        for (int i = 0; i < strings.length - 1;) {
            String temp;
            if (isGreaterThen(strings[i], strings[i + 1])) {
                temp = strings[i];
                strings[i] = strings[i + 1];
                strings[i + 1] = temp;
                if (i > 0) i--;
            } else i++;


        }
    }

    public static boolean isGreaterThen(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
