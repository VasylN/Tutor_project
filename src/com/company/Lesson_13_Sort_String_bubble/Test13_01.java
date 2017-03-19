package com.company.Lesson_13_Sort_String_bubble;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 23.10.2016.
 */
/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/
public class Test13_01 {
    public static void main(String[] args) {
        Human grandeFather1 = new Human("Дед Иван", true, 80, null,null);
        Human grandeFather2 = new Human("Ded Igor" , true, 79, null,null);
        Human grandeMather1 = new Human("Baba Ania", false,70,null,null);
        Human grandeMather2 = new Human("Baba Tania", false,69,null,null);
        Human father = new Human("papa Kolia", true, 50,grandeFather1,grandeMather2);
        Human mather = new Human("mama Olia", false, 49,grandeFather2,grandeMather2);
        Human child1 = new Human("kid Sasha" , true, 30,mather,father);
        Human child2 = new Human("kid Pasha" , true, 25,mather,father);
        Human child3 = new Human("kid Katia" , false, 20,mather,father);

        List<Human> list = new ArrayList<>();
        list.add(grandeFather1);
        list.add(grandeFather2);
        list.add(grandeMather1);
        list.add(grandeMather2);
        list.add(father);
        list.add(mather);
        list.add(child1);
        list.add(child2);
        list.add(child3);

        for (Human human : list) {
            System.out.println(human);
        }



    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mather;

        Human(String n, boolean sex, int age, Human father, Human mather) {
            this.name = n;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mather = mather;
        }

        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if(this.father != null){
                text += ", отец: " + this.father.name;
            }
            if (this.mather != null){
                text += ", мать: " + this.mather.name;
            }
            return text;
        }
    }

}
