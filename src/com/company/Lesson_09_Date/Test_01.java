package com.company.Lesson_09_Date;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Pc on 12.10.2016.
 * /*
 Создать коллекцию HashSet с типом элементов String.
 Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
 Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 Посмотреть, как изменился порядок добавленных элементов.
 */


public class Test_01 {
    public static void main(String[] args) {
         Set<String> stringSet = new HashSet<>();
        stringSet.add("арбуз");
        stringSet.add("банан");
        stringSet.add("вишня");
        stringSet.add("груша");
        stringSet.add("ирис");

        /*Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);}*/

        for (String s : stringSet) {
            System.out.println(s);
        }

    }
}
