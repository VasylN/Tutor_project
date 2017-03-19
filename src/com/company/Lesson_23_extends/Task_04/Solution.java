package com.company.Lesson_23_extends.Task_04;

import java.io.IOException;

/**
 * Created by Pc on 30.11.2016.
 *//* ООП - машинки
1.1 Создать вложенный класс Constants с переменными:
String WANT_STRING = "Я хочу ездить на ";
String LUXURIOUS_CAR = "роскошной машине";
String CHEAP_CAR = "дешевой машине";
String FERRARY_NAME = "Феррари";
String LANOS_NAME = "Ланосе";
1.2 Для вывода использовать можно только переменные из класса Constants.
2. Создать класс Ferrari, реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
3. Создать класс Lanos, реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
4. Создайте public static класс LuxuriousCar(РоскошнаяМашина).
5. Создайте public static класс CheapCar(ДешеваяМашина).
6. Унаследуйте Ferrari и Lanos от CheapCar и LuxuriousCar, подумайте, какой класс для кого.
7. В классе LuxuriousCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
8. В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
9. В класах LuxuriousCar и CheapCar для метода printlnDesire расставьте различными способами модификаторы доступа так,
чтобы в классах Ferrari и Lanos выполнялось расширение видимости.
10. В выполняющем методе вызовите метод printlnDesire() у всех классов, в который он реализован.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        LuxuriousCar.printlnDesire();
        CheapCar.printlnDesire();
        Ferrari.printlnDesire();
        Lanos.printlnDesire();
        //Constans constans = new Constans();
       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select 1 or 2");
        while (true) {
            String s = reader.readLine();
            if (s.equals("1")) {
                System.out.println(constans.WANT_STRING + constans.LUXURIOUS_CAR + constans.FERRARY_NAME);
            } else if (s.equals("2")) {
                System.out.println(constans.WANT_STRING + constans.CHEAP_CAR + constans.LANOS_NAME);

            } else {
                break;
            }
        }*/

    }

    public static class Constans {
        static String WANT_STRING = "Я хочу ездить на ";
        static String LUXURIOUS_CAR = "роскошной машине";
        static String CHEAP_CAR = "дешевой машине";
        static String FERRARY_NAME = " Феррари";
        static String LANOS_NAME = " Ланосе";

    }

    public static class LuxuriousCar {
        protected static void printlnDesire() {
            System.out.println(Constans.WANT_STRING + Constans.LUXURIOUS_CAR);
        }

    }

    public static class CheapCar {
        protected static void printlnDesire() {
            System.out.println(Constans.WANT_STRING + Constans.CHEAP_CAR);


        }
    }

}

