package com.company.Lesson_07_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 02.10.2016.
 *//* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:

лира
лоза
Выходные данные:
лира
лоза
лоза
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> str = new ArrayList<>();

        while (true) {
            String a = reader.readLine();
            if (a.isEmpty()) break;
            str.add(a);
        }

           str = fix(str);

           for (String x : str) {
               System.out.println(x);
           }

       // fixVoid(str);

    }

    public static List<String> fix(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String x : list) {
            if (x.contains("р")) {

            } else if (x.contains("л")) {
                result.add(x);
                result.add(x);
            } else if (x.contains("р") && x.contains("л")) {
                result.add(x);
            } else {
                result.add(x);
            }

        }


        return result;
    }

    public static void fixVoid(List<String> list) {

        for (int i = 0; i < list.size(); i++) {
            String x = list.get(i);
            if (x.contains("р") && x.contains("л")) {

            } else if (x.contains("л")) {
                list.add(x);
            } else if (x.contains("р")) {
                list.remove(i);
            }
        }


        for (String x : list) {
            System.out.println(x);
        }

    }
}
