package com.company.Lesson_26_Static_bloc.Task_01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 14.12.2016.
 */
public class Test_02 {
    static List<String> lines = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println(lines);
    }

    static {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(Constants.FILE_NAME));
                String line = null;
                while((line = reader.readLine()) != null){
                    lines.add(line);
                }
                reader.close();
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует");
                System.out.println("Введіть правильний шлях");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
