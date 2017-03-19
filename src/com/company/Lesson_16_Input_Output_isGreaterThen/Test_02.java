package com.company.Lesson_16_Input_Output_isGreaterThen;

import java.io.*;

/**
 * Created by Pc on 06.11.2016.
 *//*
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fil1name = reader.readLine();
        String fil2name = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fil1name);
        FileOutputStream fileOutputStream = new FileOutputStream(fil2name);

        int count = 0;

        while (fileInputStream.available() > 0){
            int date = fileInputStream.read();
            fileOutputStream.write(date);
            count++;
        }

        System.out.println("Copies byte - " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
