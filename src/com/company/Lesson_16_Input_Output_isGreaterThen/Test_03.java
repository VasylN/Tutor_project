package com.company.Lesson_16_Input_Output_isGreaterThen;

import java.io.*;

/**
 * Created by Pc on 06.11.2016.
 *//* Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли,
 а уже потом считывать файл для записи.
*/
public class Test_03 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        while (true){
            try {
                String file1 = reader.readLine();
                fileInputStream = new FileInputStream(file1);
                break;
            }catch (FileNotFoundException e){
                System.out.println("Файл не существует");
                System.out.println("Введіть правильний шлях");
            }
        }


        while (true){
            try {
                String file2 = reader.readLine();
                fileOutputStream = new FileOutputStream(file2);
                break;
            }catch (FileNotFoundException e){
                System.out.println("Файл не существует");
                System.out.println("Введіть правильний шлях");
            }
        }




        while (fileInputStream.available() > 0) {
            int date = fileInputStream.read();
            fileOutputStream.write(date);

        }
        //C:\Users\Pc\IdeaProjects\less\src\com\company\Lesson_16_Input_Output_isGreaterThen\1.txt

    }
}
