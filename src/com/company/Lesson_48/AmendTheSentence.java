package com.company.Lesson_48;

/**
 * Created by Pc on 22.03.2017.
 */
public class AmendTheSentence {
    public static void main(String[] args) {
        String s1 = "CodefightsIsAwesome";
        System.out.println(amendTheSentence(s1));
    }
    public static String amendTheSentence(String s) {
        String result = " ";
        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(chars[i])){
                result += " " +  Character.toLowerCase(chars[i]);
            }else {
                result += chars[i];
            }

        }

        return result.trim();
    }
}
