package com.company.Lesson_12_Arrays_sort_bubble;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Pc on 19.10.2016.
 */
/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/
public class Test_03 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();
        Set<Object> pets = join(dogs, cats);
        removeCats(pets, cats);
        printPets(pets);
    }


    public static class Cat {

    }

    public static class Dog {

    }

    public static Set<Cat> createCats() {
        Set<Cat> listCat = new HashSet<>();
        listCat.add(new Cat());
        listCat.add(new Cat());
        listCat.add(new Cat());
        listCat.add(new Cat());
        return listCat;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> listDog = new HashSet<>();
        listDog.add(new Dog());
        listDog.add(new Dog());
        listDog.add(new Dog());
        return listDog;
    }

    public static Set<Object> join(Set<Dog> list1, Set<Cat> list2) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(list1);
        pets.addAll(list2);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }
}


