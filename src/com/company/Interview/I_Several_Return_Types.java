package com.company.Interview;

/**
 * Created by Pc on 20.11.2016.
 */
public class I_Several_Return_Types {
    public static void main(String[] args) {
        DoubleInt e = method1();
        System.out.println(e.a * 5);
        System.out.println(e.b * 5);
    }

    private static DoubleInt method1(){
        int a = 5;
        double b = 10.7;
        return new DoubleInt(a, b);
    }

    private static class DoubleInt{
        int a;
        double b;

        private DoubleInt(int a, double b) {
            this.a = a;
            this.b = b;
        }
    }

}
