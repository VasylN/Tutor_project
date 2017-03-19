package com.company.Lesson_13_Sort_String_bubble;

import java.util.Date;

/**
 * Created by Pc on 23.10.2016.
 *//* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/
public class Test_02 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2016"));
    }

    public static boolean isDateOdd(String date){
      return  new Date(date).getDate()%2 != 0;
    }

}
