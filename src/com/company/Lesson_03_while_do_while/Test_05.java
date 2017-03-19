package com.company.Lesson_03_while_do_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 18.09.2016.
 */
/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
 вывести на экран сумму и завершить программу.
  -1 должно учитываться в сумме.
*/
public class Test_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i;
        int sum = 0;
        do{
            i = Integer.parseInt(reader.readLine());
            sum += i;
        }while (i != -1);
        System.out.println(sum);
    }

    }
