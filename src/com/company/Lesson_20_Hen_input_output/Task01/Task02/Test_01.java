package com.company.Lesson_20_Hen_input_output.Task01.Task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 16.11.2016.
 *//*
1. Создать классы CatFactory, Cat, MaleCat, FemaleCat
2. В классе Cat создать переменную name, сделать её приватной.
3. Реализовать метод toString() в классе Cat, он должен возвращать строку типа "Я уличный кот " + *Имя кота*;
4. Унаследовать MaleCat и FemaleCat от Cat.
5. В классах MaleCat, FemaleCat переопределить конструктор супер класса, а также реализовать метод toString():
- В классе MaleCat метод toString() должен вренуть строку типа "Я - солидный кошак по имени " + Имя кота
- В классе FemaleCat метод toString() должен вренуть строку типа "Я - милая кошечка по имени " + Имя кота
6. В классе CatFactory создать метод getCatByKey(String type),
 который в зависимости от типа кота должен вернуть объект с определенным типом кота.
 - cur - уличный кот (toString() Cat)
 - male - солидный кошак (toString() Male)
 - female - милая кошечка (toString() Female)
7. В выполняющем методе считывать имя кота с консоли, пока пользователь не введет пустую строку(Enter).
8. Если у кота есть имя, ввести тип кота.
Для каждого параметра:
9. Создать объект cat класса Cat, который равен коту из getCatByKey(String тип).
10. Вывести на экран cat.toString().
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        while (!((name = reader.readLine()).equals(""))) {
            String type = reader.readLine();
            Cat cat = CatFactory.getCatByKey(name,type);
            System.out.println(cat);
        }



    }

    public static class CatFactory {
        public static Cat getCatByKey(String name, String type) {
            Cat cat = null;
            if (type.equals("cur"))
                cat = new Cat(name);
            else if (type.equals("male"))
                cat = new MaleCat(name);
            else if (type.equals("female"))
                cat = new FemaleCat(name);
            else {
                cat = new Cat(name);
            }
            return cat;
        }

    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Я уличный кот " + getName();
        }


    }

    public static class MaleCat extends Cat {

        public MaleCat(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    public static class FemaleCat extends Cat {

        public FemaleCat(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
