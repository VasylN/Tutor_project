package com.company.HomWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Pc on 06.11.2016.
 *//* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/
public class Hw_15 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date d = new Date(reader.readLine());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd, yy, MMMM EEEE", Ukraine);


        System.out.println(simpleDateFormat.format(d).toUpperCase());
    }

    private static DateFormatSymbols Ukraine = new DateFormatSymbols(){
        @Override
        public String[] getMonths() {
            return new String[]{"", "", ""};
        }

    };
}
