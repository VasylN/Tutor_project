package com.company.Lesson_11_Iterator_removeMap_putMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Pc on 16.10.2016.
 *//* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/
public class Test_03 {
   static Cat cat1 = new Cat("cat1");
   static Cat cat2 = new Cat("cat2");
   static Cat cat3 = new Cat("cat3");


    public static void main(String[] args) {
        Set set = createCats();

        Iterator<Cat> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(cat2)) {
                iterator.remove();
            }
        }

        printCats(set);
    }

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static Set createCats() {
        Set<Cat> stringSet = new HashSet<>();
        stringSet.add(cat1);
        stringSet.add(cat2);
        stringSet.add(cat3);
        return stringSet;
    }

    public static void printCats(Set set) {
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
