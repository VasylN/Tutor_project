package com.company.Lesson_09_Date;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pc on 12.10.2016.
 * /* Коллекция HashMap из котов
 * Есть класс Cat с полем имя (name, String).
 * Создать коллекцию HashMap<String, Cat>.
 * Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
 * Вывести результат на экран, каждый элемент с новой строки.
 */

public class Test_05 {
    public static void main(String[] args) {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        Map<String, Cat> map = addCatToMap(cats);
        printCat(map);

    }

    public static Map<String, Cat>  addCatToMap(String [] cat) {
        Map<String,Cat> map = new HashMap<>();
        for (String s : cat) {
            map.put(s, new Cat(s));
        }
        return map;
    }

    public static void printCat(Map<String, Cat> catMap){
        for (Map.Entry<String, Cat> pair : catMap.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }

    public static class Cat {
        String name;

        @Override
        public String toString() {
            return  name != null ? name.toUpperCase() : null;
        }

        Cat(String n) {
            this.name = n;
        }

    }

}
