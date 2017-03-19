package com.company.Lesson_15_checked_unchecked;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 30.10.2016.
 *//* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader-а)
этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа,
то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/
public class Test_06 {
    public static void main(String[] args) {
        readData();
        System.out.println("Prog is still running!");
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        try {
            while (true) {
                String s = reader.readLine();
                if (s.isEmpty()) break;
                int n = Integer.parseInt(s);
                list.add(n);
            }
            for (int i = 0; i < list.size() + 1; i++) {
                list.get(i);
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Enter a number!");
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println( list);
        }
    }
}
