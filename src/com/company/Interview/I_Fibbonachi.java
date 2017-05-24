package com.company.Interview;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Pc on 20.11.2016.
 *//*Найти ряд Фибоначи для числа 11*/
 /* index <= 0 = 0;
    1 -- 0 + 0 = 1; - свойство
    2 -- 1 + 0 = 1;
    3 -- 1 + 1 = 2;
    4 -- 2 + 1 = 3;
    5 -- 3 + 2 = 5;
    6 -- 5 + 3 = 8;
    7 -- 8 + 5 = 13;
    8 -- 13 + 8 = 21;
    9 -- 21 + 13 = 34;
    10 -- 34 + 21 = 55;
    11 -- 55 + 34 = 89;
  */
public abstract class I_Fibbonachi {
    Map
    public static void main(String[] args) {
        int n = 11;
        for (int i = 1; i <= n; i++) {
            System.out.println(fibon(i));
        }
    }
    public static int fibon (int index){
        if(index <= 0) return 0;
        else if(index == 1) return 1;
        else if(index == 2) return 1;
        else return fibon(index - 1) + fibon(index - 2);
    }

    abstract void m();
}

interface B{
    public final static int a = 10;

    public abstract void m1();

    default void m(){
        System.out.println("");
    }
}