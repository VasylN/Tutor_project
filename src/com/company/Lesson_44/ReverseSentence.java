package com.company.Lesson_44;

/**
 * Created by Pc on 12.03.2017.
 */
public class ReverseSentence {
    public static void main(String[] args) {
        System.out.println(reverseSentence("Man bites dog"));
    }

    public static String reverseSentence(String sentence) {
        String[] strings = sentence.split(" ");
        String result = "";
        for (int i = strings.length -1; i >= 0; i--) {
            result += strings[i] + " ";
        }
        return result.trim();
    }

}
