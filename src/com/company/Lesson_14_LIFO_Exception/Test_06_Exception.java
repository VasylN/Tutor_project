package com.company.Lesson_14_LIFO_Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Throwable and Exception - cheked// глобальні
// Error and RuntimeError - unchecked//  не глобальні// try catch

/**
 * Created by Pc on 26.10.2016.
 */
public class Test_06_Exception {
  static  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        int s = 0;
       try{
            bufRead();
       }
         catch (Exception e) {
            System.out.println("Enter some number!");
             try {
                 s = Integer.parseInt(reader.readLine());
             } catch (Exception e1) {
                 System.out.println("End!");
             }
         }
         finally {
           System.out.println("fwefewf");
       }
        System.out.println(s);
        System.out.println("Programm is still running");
        System.out.println("Programm is still running");
        System.out.println("Programm is still running");
        System.out.println("Programm is still running");

    }

    public static void bufRead() throws IOException {

        int s = Integer.parseInt(reader.readLine());
        System.out.println("Number = " + s);
    }


}
