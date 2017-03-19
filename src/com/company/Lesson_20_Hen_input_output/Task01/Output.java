package com.company.Lesson_20_Hen_input_output.Task01;

import java.io.*;

/**
 * Created by Pc on 16.11.2016.
 *//* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/
public class Output {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        OutputStream fileOutputStream = new FileOutputStream(fileName);

        while (true){
           String s = reader.readLine();
            if (s.equals("exit")){
                fileOutputStream.write(s.getBytes());
                break;
            } else {
                fileOutputStream.write((s + "\n").getBytes());
            }

        }

    }
}
