package com.company.Lesson_19_class_Person_Repka.Test1;

/**
 * Created by Pc on 13.11.2016.
 */
public class Person implements RepkaItem{
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public void pull(Person person){
        System.out.println(this.name + " za " + person.getNamePadezh());
    }

    @Override
    public String getNamePadezh() {
        return namePadezh;
    }
}
