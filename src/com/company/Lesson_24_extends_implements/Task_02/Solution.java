package com.company.Lesson_24_extends_implements.Task_02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 04.12.2016.
 *//* ООП
1. Создать интерфейс Alive с методом Object containsBones().
2. Создать класс BodyPart, который реализует интерфейс Alive.
2.1 Создать приватную переменную name и сделать конструктор для инициализации.
2.2 Метод containsBones должен возвращать тип Object и значение "Yes"
2.3 Переопределить метод toString(), он должен возвращать name + " содержит кости", если containsBones возвращает true,
или он должен возвращать name + " не содержит кости", если containsBones возвращает false.
3. Создать класс Finger, который наследуется от класса BodyPart.
3.1 Создать приватную переменную boolean isFoot (это стопа?), переопределить конструктор супер-класса, добавить инициализацию
переменной isFoot
3.2 Переопределить метод containsBones, он должен возвращать тип Object и значение "Yes" вместо true,
если super.containsBones().equals("Yes") && !isFoot, или "No" вместо false
4. Создать метод printlnBodyParts():
- В методе создать список частей тела, добавить в этот список 4 объекта BodyPart (Рука, Нога, Голова, Тело)
- Вывести на экран каждый объект
5. Создать метод printlnFingers():
- В методе создать список пальцев, добавить в этот список 5 объектов Finger
(Большой - рука, Указательный - рука, Средний - стопа, Безымянный - стопа, Мезинец - рука)
- Вывести на экран каждый объект
6. Вызвать методы в main.
*/
public class Solution {
    public static void main(String[] args) {
        printlnBodyParts();
        printlnFingers();
    }

    public static void printlnBodyParts(){
        List<BodyPart> bodyParts = new ArrayList<>();
        bodyParts.add(new BodyPart("Leg"));
        bodyParts.add(new BodyPart("Body"));
        bodyParts.add(new BodyPart("Heand"));
        bodyParts.add(new BodyPart("Head"));
        for (BodyPart bodyPart : bodyParts) {
            System.out.println(bodyPart);
        }

    }
    public static void printlnFingers(){
        List<Finger> fingers = new ArrayList<>();
        fingers.add(new Finger("Big toe", false));
        fingers.add(new Finger("Finger pointing", false));
        fingers.add(new Finger("Finger middle", true));
        fingers.add(new Finger("No name" , true));
        fingers.add(new Finger("Finder pinky", false));

        for (Finger finger : fingers) {
            System.out.println(finger);
        }

    }

}
