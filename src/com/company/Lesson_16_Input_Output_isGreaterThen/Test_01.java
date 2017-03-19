package com.company.Lesson_16_Input_Output_isGreaterThen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 06.11.2016.
 *//* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
ама мыла рамуМ.
Пример вывода:
а а ы а а у
М м м л р м .
public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s  = reader.readLine();
        char[] chars = s.toCharArray();
        String vowelToPrint = "";
        String consonantsToPrint = "";
        for (char aChar : chars) {
            if(isVowel(aChar)){
                vowelToPrint += aChar + " ";
            }else if(!isVowel(aChar) && aChar != ' '){
                consonantsToPrint += aChar + " ";
            }
        }
        System.out.println(vowelToPrint);
        System.out.println(consonantsToPrint);

    }
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        for (char vowel : vowels) {
            if(vowel == c){
                return true;
            }
        }return false;


    }
}
