package com.company.Lesson_44;

/**
 * Created by Pc on 12.03.2017.
 */
public class ReverseSentence {
    public static void main(String[] args) {
        System.out.println(reverseSentence("Man bites dog"));
    }
   public static String reverseSentence(String sentence) {

        String.valueOf(sentence);
        return new StringBuffer(sentence).reverse().toString();

    }
}
