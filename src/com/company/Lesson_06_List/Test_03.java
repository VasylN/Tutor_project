package com.company.Lesson_06_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 28.09.2016.
 */
/* 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 5 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> st = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            st.add(0,reader.readLine());

        }
        for (int i = 0; i < st.size(); i++) {
            System.out.println(st.get(i));
        }

    }

}
