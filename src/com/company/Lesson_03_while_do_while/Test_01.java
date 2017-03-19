package com.company.Lesson_03_while_do_while;

/**
 * Created by user on 18.09.2016.
 */
public class Test_01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mursic",1, 2);
        Cat cat2 = new Cat("Murz", 2, 4);
        System.out.println(cat1.name + " " + cat1.age + " " + cat1.weight);
        System.out.println(cat2.name + " " + cat2.age + " " + cat2.weight);


    }

    public static class Cat{
        String name;
        int age;
        int weight;

        Cat(String n, int a, int i){
            this.name = n;
            this.age = a;
            this.weight = i;

        }

    }

}
