package com.company.Lesson_26_Static_bloc.Task_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 14.12.2016.
 *//* Файл в статическом блоке
1. Инициализируйте константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считайте из файла с именем Constants.FILE_NAME все строки и добавьте их по-отдельности в List lines.
3. Отловите все исключения, которые могут возникнуть в программе.
3. Закройте поток ввода методом close().
4. В выполняющем методе выводите на экран все значения списка lines.
*/
public class Test_01 {
   static List<String> lines;
    public static void main(String[] args) {
        System.out.println(lines.get(0));
    }

    static {
        FileInputStream fileInputStream = null;
         lines = new ArrayList<>();
        while (true){
            try {
                fileInputStream = new FileInputStream(Constants.FILE_NAME);
                break;
            }catch (FileNotFoundException e){
                System.out.println("Файл не существует");
                System.out.println("Введіть правильний шлях");
            }
        }

        try {
            String s = "";
            while (fileInputStream.available() > 0){
                char c = (char) fileInputStream.read();
                s += c;
            }
            lines.add(s);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
