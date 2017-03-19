package com.company.Lesson_34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 18.01.2017.
 *//* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        maxDiv(a, b);

    }

    public static void maxDiv(int a, int b) {
        int temp = 1;
        int temp1 = 0;
        while (temp <= a && temp <= b) {
            if (a % temp == 0 && b % temp == 0) {
                temp1 = temp;
                temp++;

            } else
                temp++;

        }
        System.out.println(temp1);
    }
}
