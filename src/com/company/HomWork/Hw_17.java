package com.company.HomWork;

/**
 * Created by Pc on 09.11.2016.
 */
/* Создать класс Pet с методом getName, которій возвращает строку "Я - пушистик"
Создать класс Cat и унаследоваться от Pet
Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись
«Я - кот».
*/
public class Hw_17 {
    public static void main(String[] args) {
        Pet pet = new Cat();
        System.out.println(pet.getName());

    }
    public static class Pet{
        public String getName(){
            return "Я - пушистик";
        }

    }
    public static class Cat extends Pet{
        @Override
        public String getName() {
            return "Я - кот";
        }
    }
}
