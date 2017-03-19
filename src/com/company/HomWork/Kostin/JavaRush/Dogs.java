package com.company.HomWork.Kostin.JavaRush;

/**
 * Created by Pc on 20.11.2016.
 */
public class Dogs {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog1.name = "Max";
        dog2.name = "Bella";
        dog3.name = "Jack";
        System.out.println(dog1.name + " " + dog2.name + " " + dog3.name);
        System.out.println();


    }


    public static class Dog {
        public String name;

    }
}
