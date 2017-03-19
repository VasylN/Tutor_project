package com.company.Lesson_16_Input_Output_isGreaterThen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 06.11.2016.
 *//* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/
public class Test_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true){
            String s = reader.readLine();
            if(s.isEmpty()){
                break;
            }
            list.add(s);

        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void sort(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(isNumberExc(arr[i])){                                                // sort numbers
                for (int j = 0; j < arr.length; j++) {
                    if(isNumberExc(arr[j])){
                        int a = Integer.parseInt(arr[i]);
                        int b = Integer.parseInt(arr[j]);
                        if(a > b) {
                            String temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                    }
            }else{                                                                  // sort strings
                for (int j = 0; j < arr.length ; j++) {
                    if (!isNumberExc(arr[j])) {
                        if (!isGreaterThen(arr[i], arr[j])) {
                            String temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
            }
        }
    }

    public static boolean isGreaterThen(String a, String b){
        return a.compareTo(b) > 0;
    }

    public static boolean isNumberExc(String s){
        try{
            Integer.parseInt(s);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }

//    public static boolean isNumber(String s){
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            char c = chars[i];
//            if ((!Character.isDigit(c) && c != '-') || (i != 0 &&  c != '-' )) return false;
//        }
//        return true;
//    }


}


























