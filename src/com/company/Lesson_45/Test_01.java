package com.company.Lesson_45;

/**
 * Created by Pc on 12.03.2017.
 */

abstract class A {
    int a = 8;

    public A() {
        show();
    }

    abstract void show();
}

class B extends A {
     static int a;
    static {
        a = 90;
    }

    void show() {
        System.out.println("" + a);
    }

    public static void main(String args[]) {
        new B();
    }
}

