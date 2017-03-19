package com.company.HomWork.Repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 06.01.2017.
 *//* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4//вложений
8888
8888
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        /*for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("GameOver  ");
            }
            System.out.println();
        }*/
        for (int i = 0; i < m; i++) {
            for (int j = n; j > 0; j--) {
                System.out.print("GameOver  ");
            }
            System.out.println();
        }

    }
}
