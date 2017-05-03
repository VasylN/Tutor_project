package com.company.Lesson_56;

/**
 * Created by Pc on 03.05.2017.
 */
public class Test_01 {
    public static void main(String[] args) {
        String s = "weather";
        String t = "therapyw";
        System.out.println(sortByString(s, t));

    }

    public static String sortByString(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        String result = "";
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (chars1[i] == chars[j]) {
                    result += chars1[i];
                }
            }

        }
        return result;
    }
}
