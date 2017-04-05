package com.company.Lesson_51.Task_01.Task_02;

/**
 * Created by Pc on 05.04.2017.
 */
public class StringReformatting {
    public static void main(String[] args) {
        String s  = "2-4a0r7-4k2-4a0r7-4k";
        int k = 4;
       System.out.println(stringReformatting(s,k));

    }
   public static String stringReformatting(String s,int k) {
       char [] chars = s.toCharArray();
       String s1 = "";
       for (int i = 0; i < chars.length; i++) {
           if (chars[i] != '-'){
             s1 += chars[i];
               if (i%k == 0 && i!=0){
                   s1+= '-';
               }
           }
       }


    return s1;
    }
}
