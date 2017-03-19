package com.company.Lesson_14_LIFO_Exception;

import java.io.IOException;

/**
 * Created by Pc on 26.10.2016.
 */
public class Test_08_Exception {
    public static void main(String[] args) throws IOException {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double n1 = Double.parseDouble(reader.readLine());
        double n2 = Double.parseDouble(reader.readLine());*/
        int n = 5;
        int m = 0;
        int i;

        try{
           i = n/m;
            System.out.println(i);
        } catch (Exception e){
            System.out.println("Деление на ноль невозможно!");
        }
    }
}
