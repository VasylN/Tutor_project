package com.company.Lesson_08_List_Set_Map;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 05.10.2016.
 */
public class Test_04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sdw");
        list.add("sdw");
        list.add("sdwrfw");
        list.add("sdwrfw");
        list.add("sdwqewr");
        list.add("sdwqewr");

        /*Iterator <String> iterator = list.iterator();
        while (iterator.hasNext() ){
            String text = iterator.next();
            System.out.println(text);
        }*/

        for (String text : list) {
            System.out.println(text);
        }


    }
}
