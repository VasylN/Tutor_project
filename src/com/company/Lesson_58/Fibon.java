package com.company.Lesson_58;

/**
 * Created by Pc on 14.05.2017.
 */
public class Fibon {
    public static void main(String[] args) {
        int i = 10;
        for (int j = 1; j <=10 ; j++) {
            System.out.println(fibon(j));
        }
    }
    public static int fibon(int i){
        if(i<=0)
            return 0;
        else if(i==1)
            return 1;
        else if (i==2)
            return 1;
        else return fibon(i-1)+fibon(i-2);
    }
}
