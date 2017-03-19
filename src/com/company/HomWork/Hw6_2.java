package com.company.HomWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 02.10.2016.
 */
/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка,
 и выведи оставшиеся элементы в обратном порядке.
*/
public class Hw6_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> str = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            str.add(s);

        }
        str.remove(2);
        System.out.println();
        for (int i = 0; i < str.size(); i++) {
            int j = str.size() - 1 - i;

            System.out.println(str.get(j));
        }


    }
}
