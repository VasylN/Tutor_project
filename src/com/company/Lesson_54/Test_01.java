package com.company.Lesson_54;

/**
 * Created by Pc on 23.04.2017.
 */
public class Test_01 {

}

abstract class A {
    int a = 8;

    public A() {
        show();
    }

    abstract void show();
}

class B extends A {
    int a;

    {
        a = 90;
    }

    void show() {
        System.out.println("" + a);
    }

    public static void main(String args[]) {
        new B().show();
    }
}