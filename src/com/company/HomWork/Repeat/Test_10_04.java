package com.company.HomWork.Repeat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 10.04.2017.
 *//* Самая длинная строка
 найди самую длинную строку в списке.
*/
public class Test_10_04 {
    public static void main(String[] args) {
        System.out.println(createList());

    }

    public static List<String> createList() {
        List<String> stringList = new ArrayList<>();
        stringList.add("SSS");
        stringList.add("SSSee");
        stringList.add("SSSeeee");
        stringList.add("SSSeeeeee");
        int max = 0;
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() > max)
                max = stringList.get(i).length();

        }
        return stringList;
    }

}
