package com.company.Lesson_17_class;

/**
 * Created by Pc on 07.11.2016.
 *//*
Создать 2 класса Сow и Whale.
В классе Cow создать метод getName(), который возвращает строку "Я - корова".
Унаследовать Whale от Cow
Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
Я не корова, Я - кит.
*/
public class Test_04 {
    public static void main(String[] args) {
        Cov cov = new Whale();
        System.out.println(cov.getName());
        cov.print();
    }
    public static class Cov{
        public String getName(){
            return "Я - корова";
        }

        public void print(){
            System.out.println("text");
        }
    }

    public static class Whale extends Cov{
        @Override
        public String getName() {
            return ("Я не корова, Я - кит ");
        }

        @Override
        public void print() {
            System.out.println("Text01");
        }
    }
}
