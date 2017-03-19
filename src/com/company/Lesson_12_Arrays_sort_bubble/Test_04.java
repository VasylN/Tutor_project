package com.company.Lesson_12_Arrays_sort_bubble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 19.10.2016.
 */
/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.
Пример ввода:
  мама     мыла раму.
Пример вывода:
  Мама     Мыла Раму.*/
public class Test_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        char[] charArray = s.toCharArray();
        char[] char2Array = s.toCharArray();


        for (int i = 0; i < charArray.length - 1; i++) {
            charArray[0] = Character.toUpperCase(charArray[0]);
            if(charArray[i] == ' ' ){
                charArray[i+1] = Character.toUpperCase(charArray[i+1]);
            }
        }
        System.out.println(charArray);
        for (int i = 0; i < char2Array.length - 1 ; i++) {
            char2Array[0] = Character.toLowerCase(char2Array[0]);
            if(char2Array[i] == ' '){
                char2Array[i + 1] = Character.toLowerCase(char2Array[i + 1]);
            }
        }
        System.out.println(char2Array);
    }
}
