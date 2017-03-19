package com.company.Lesson_20_Hen_input_output.Task01;

import java.io.*;

/**
 * Created by Pc on 16.11.2016.
 *//* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/
public class Input {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = null;
        while (true) {
            try {
                String file1 = reader.readLine();
                fileInputStream = new FileInputStream(file1);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует");
                System.out.println("Введіть імя файла");
            }

        }
        while (fileInputStream.available() > 0) {
            int date = fileInputStream.read();
            System.out.print((char)date);

        }
        fileInputStream.close();

    }
}
