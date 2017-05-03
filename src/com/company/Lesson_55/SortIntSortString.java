package com.company.Lesson_55;

/**
 * Created by Pc on 30.04.2017.
 */
public class SortIntSortString {
    public static void main(String[] args) throws Exception {
        String[] mas = {"public", "4", "3", "5", "static", "void", "main"};
        sort(mas);
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

    }

    public static void sort(String[] mas) throws Exception {
        for (int i = 0; i < mas.length; i++) {
          if(isNumber(mas[i])){
              for (int j = 0; j < mas.length; j++) {
                  if(isNumber(mas[j])){
                      int a = Integer.parseInt(mas[i]);
                      int b = Integer.parseInt(mas[j]);
                      if(a > b){
                         String temp = mas[i];
                          mas [i] = mas[j];
                          mas[j] = temp;

                      }
                  }
              }
          } else {
              for (int j = 0; j < mas.length; j++) {
                  if(!isNumber(mas[j])){
                      if (isGreater(mas[i], mas[j])){
                          String temp = mas[j];
                          mas[j] = mas[i];
                          mas[i] = temp;
                      }
                  }
              }
          }

        }
    }

    public static boolean isNumber(String mas) throws Exception {
        try {
            Integer.parseInt(mas);
        } catch (Exception e) {
            return false;
        }


        return true;
    }

    public static boolean isGreater(String a, String b) {
        return a.compareTo(b) > 0;

    }
}
