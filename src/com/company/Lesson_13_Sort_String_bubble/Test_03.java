package com.company.Lesson_13_Sort_String_bubble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 23.10.2016.
 *//* Задача по алгоритмам
Задача: Введи с клавиатуры 10 слов и выведи их в алфавитном порядке.
*/
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array [i] = reader.readLine();

        }

        sort(array);

        for (String s : array) {
            System.out.println(s);
        }

    }
    public static void sort(String[] masString){  // a t d f e -> a d t f e -> a d f t e -> a d f e t
        for (int i = 0; i < masString.length - 1;) { // 0 1 0 1 2 0 1 2 3 0
            int j = 1 + i; // 1 2 1 2 3 1 2 3 4 1
            String temp = null;
            if (isGreaterThen(masString[i], masString[j] )){ // a==t -> t==d -> a==d -> d==t -> t==f -> - - - t==e
                temp = masString[i];
                masString[i] = masString[i + 1];
                masString[i + 1]= temp;
                if(i > 0) i--;
            } else i++;
        }
    }

    public static boolean isGreaterThen (String a, String b){
        return a.compareTo(b) > 0;
    }

}
