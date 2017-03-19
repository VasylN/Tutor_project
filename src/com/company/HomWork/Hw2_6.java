package com.company.HomWork;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 18+
 * Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
 */
public class Hw2_6 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введіть імя і вік");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = Integer.parseInt(reader.readLine());

        if (i > 18) {
            System.out.println("Ваше Імя " + s + ". Вік " + i);
        } else {
            System.out.println("Потрібно трішки підрости )))))");
        }
    }

}
