package com.company.Lesson_06_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 28.09.2016.
 */
/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> st = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            st.add(reader.readLine());
        }

        int max = 0; //  int min = st.get(0).length();
        for (int i = 0; i < st.size(); i++) {
            if(st.get(i).length() > max) // <
                max = st.get(i).length();
            }

        for (int i = 0; i < st.size(); i++) {
            if(st.get(i).length() == max)
                System.out.println(st.get(i));
        }
        }

    }

