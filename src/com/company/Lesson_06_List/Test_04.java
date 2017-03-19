package com.company.Lesson_06_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 28.09.2016.
 */
/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Test_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> st = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            st.add(reader.readLine());

        }
        for (int i = 0; i < 17 ; i++) {
           String n = st.remove(st.size() - 1);
            st.add(0,n);

        }
        for (int i = 0; i < st.size(); i++) {
            System.out.println(st.get(i));
        }
    }
}
