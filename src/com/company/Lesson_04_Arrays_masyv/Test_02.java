package com.company.Lesson_04_Arrays_masyv;

/**
 * Created by user on 21.09.2016.
 */
public class Test_02 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", 5, 200);
        Cat cat2 = new Cat("Mur", 2, 300);

        if(cat1.fight(cat2)){
            System.out.println("winner is.." + cat1.name);
        }else {
            System.out.println("winner is.." + cat2.name);
        }

    }


    public static class Cat{
        String name;
        int age;
        int power;


        Cat(String n, int a, int p){
            this.name = n;
            this.age = a;
            this.power = p;
        }

        public boolean fight (Cat anotherCat){
        return this.power > anotherCat.power;
    }

    }
}
