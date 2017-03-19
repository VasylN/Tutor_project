package com.company.Lesson_23_extends.Task_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 30.11.2016.
 *//*Считать с консоли несколько ключей (строк).
        7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
        8. Создать переменную movie класса Movie и для каждой введенной строки(ключа):
        8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
        8.2. Вывести на экран movie.getClass().getSimpleName() + movie.getGenre();.*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String key = reader.readLine();
         if(key.equals("cartoon") || key.equals("thriller") || key.equals("soapOpera")){
             Movie movie = MovieFaktory.getMovie(key);
             System.out.println(movie.getClass().getSimpleName() + movie.getGenre());
         }else {
             System.out.println("");
             break;
         }


        }
    }
}
