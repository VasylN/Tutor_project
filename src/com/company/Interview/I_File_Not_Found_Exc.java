package com.company.Interview;

import java.io.*;

/**
 * Created by Pc on 06.11.2016.
 */
public class I_File_Not_Found_Exc {


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
