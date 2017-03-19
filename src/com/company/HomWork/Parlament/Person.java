package com.company.HomWork.Parlament;

/**
 * Created by Pc on 19.02.2017.
 */
public class Person {
    private static int weight;
    private static int growth;

    public static void setWeight(int weight) {
        Person.weight = weight;
    }

    public static void setGrowth(int growth) {
        Person.growth = growth;
    }

    public static int getWeight() {

        return weight;
    }

    public static int getGrowth() {
        return growth;
    }
}
