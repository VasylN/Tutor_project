package com.company.Lesson_07_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 02.10.2016.
 */
/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> st = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            st.add(reader.readLine());
        }
        st = doubleValues(st);
        for (String x : st) {
            System.out.println(x);
        }
    }

    public static List<String> doubleValues(List<String> list){
        List<String> result = new ArrayList<>();
        for (String x : list) {
           result.add(x);
           result.add(x);
        }

        return result;
    }


}
