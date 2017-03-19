package com.company.Lesson_42;

/**
 * Created by Pc on 26.02.2017.
 */
public class Test_01 {
    private static String name1 = "Olya";
    private static String name2 = "Lena";


    public static void swap() {
        synchronized (Test_01.class) {
            String s = name1;
            name1 = name2;
            name2 = s;
        }
    }

    public void swap1() {
        synchronized (this) {
            String s = name1;
            name1 = name2;
            name2 = s;
        }
        System.out.println("ok");
    }

    public synchronized void swap2() {
        String s = name1;
        name1 = name2;
        name2 = s;
        System.out.println("ok");
    }
}
