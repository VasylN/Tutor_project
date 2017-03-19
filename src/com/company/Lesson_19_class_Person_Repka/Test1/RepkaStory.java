package com.company.Lesson_19_class_Person_Repka.Test1;

import java.util.List;

/**
 * Created by Pc on 13.11.2016.
 */
public class RepkaStory {
    public static void tell(List<Person> list) {
        Person name;
        Person namePadezh;
        for (int i = list.size()-1; i > 0; i--) {
            name = list.get(i);
            namePadezh = list.get(i-1);

            name.pull(namePadezh);
        }
    }
}
