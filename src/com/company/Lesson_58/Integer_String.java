package com.company.Lesson_58;

/**
 * Created by Pc on 14.05.2017.
 */
public class Integer_String {
    public static void main(String[] args) {
        integer_String integer_string = integerstring();
        System.out.println(integer_string.i + " " + integer_string.s);

    }
    public static class integer_String{
        int i;
        String s;

        public integer_String(int i, String s) {
            this.i = i;
            this.s = s;
        }
    }
    public static integer_String  integerstring(){
        int i = 10;
        String s = "S";
        return new integer_String(i,s);

    }
}
