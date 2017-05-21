package com.company.Lesson_60;

/**
 * Created by Pc on 21.05.2017.
 */
public abstract class Test_01 {
    int a = 10;
    static final int b = 40;

    abstract void m();

    void met(){
        m();
        m3();
    }

    protected static void m3() {

    }

    public static void main(String[] args) {
        String s = "text";
        String s2 = new String("text");
        System.out.println(s == s2); // true
        System.out.println(s.equals(s2)); // true


    }
}

interface B {
    int a = 10;
    static final int b = 40;

    public abstract void method();

    default void method1() {
        System.out.println("method");
    }
}

class C {
    Test_01 t;

    public void setT(Test_01 t) {
        this.t = t;
    }
}