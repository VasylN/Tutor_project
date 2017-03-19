package com.company.Lesson_18_abstract_Interface;

/**
 * Created by Pc on 09.11.2016.
 *//* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
Написать метод, который определяет, объект какого класса ему передали,
и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
*/
public class Test_01 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new UnknowPet()));
        System.out.println(getObjectType(new UnknowPet1()));
    }
    public static class Cow{

    }
    public static class Whale{

    }
    public static class Dog{

    }
    public static class UnknowPet{

    }
    public static class UnknowPet1{

    }
    public static String getObjectType(Object o){
        String tmp;
        if(o instanceof Cow){
            tmp = "Корова";
        } else if(o instanceof Whale){
            tmp = "Кит";

        }else if(o instanceof Dog ){
            tmp = "Собака";
        }else {
            tmp = "Неизвестное животное";
        }
        return tmp;
    }

}
