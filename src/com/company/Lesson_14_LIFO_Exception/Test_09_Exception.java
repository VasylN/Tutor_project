package com.company.Lesson_14_LIFO_Exception;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 26.10.2016.
 */
public class Test_09_Exception {
    public static void main(String[] args) {
        try{
            List<String> list = new ArrayList<>();
            String s = list.get(2);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        List<String> list = new ArrayList<>();
        String s = list.get(2);
        System.out.println(list);
    }
}
