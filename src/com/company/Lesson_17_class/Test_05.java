package com.company.Lesson_17_class;

/**
 * Created by Pc on 07.11.2016.
 *//*
Создать классы Pet, Cat, Dog
В классе Pet создать метод getChild(), который возвращает экземпляр класса Pet.
Переопределить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.
*/
public class Test_05 {
    public static void main(String[] args) {


    }
    public static class Pet{
        public Pet getChild(){

            return new Pet();
        }
    }

    public static class Cat extends Pet{
        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet{
        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}
