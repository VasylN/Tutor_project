package com.company.Lesson_03_while_do_while;

/**
 *
 */
public class Test_02 {
    public static void main(String[] args) {
        Woman woman = new Woman("Kat",20);
        Cat cat = new Cat("Mursik", 2 ,woman);
        Dog dog = new Dog("Jek", 5 , woman);
        Fishe fishe = new Fishe("Okun", 1,woman);
        System.out.println(cat.name + " " + cat.age + " " + cat.owner.name);
        System.out.println(dog.name + " " + dog.age + " " + dog.owner.name);
        System.out.println(fishe.name + " " + fishe.age + " " + fishe.owner.name);

    }

    public static class Woman{
        String name;
        int age;

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class Cat {
        String name;
        int age;
        Woman owner;

        Cat(String n, int a, Woman b){
            this.name = n;
            this.age = a;
            this.owner = b;
        }
    }

    public static class Dog {
        String name;
        int age;
        Woman owner;

        Dog(String n, int a, Woman b){
            this.name = n;
            this.age = a;
            this.owner = b;
        }
    }
    public static class Fishe {
        String name;
        int age;
        Woman owner;

        Fishe(String n, int a, Woman b){
            this.name = n;
            this.age = a;
            this.owner = b;
        }
    }
}
