package com.company.Lesson_34;

/**
 * Created by Pc on 18.01.2017.
 */
public class Test_02 {
    public static void main(String[] args) {
        int i = 11;
        for (int j = 0; j<=i; j++) {
            System.out.println(fib(j));
        }
    }
    public static int fib(int index){
        if(index <= 0)
            return 0;
        else if(index == 1)
            return 1;
        else if(index == 2)
            return 1;
        else return fib(index - 1) + fib(index -2);

    }

}
