package com.company.Lesson_18_abstract_Interface;

/**
 * Created by Pc on 09.11.2016.
 *//* Пиво и кола
Создать интерфейс Drink и классы Cola и Beer
В интерфейсе Drink создай метод isAlcoholic();
Реализуй интерфейс Drink в классах Beer и Cola.
Создать метод print, который должен определить какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
И вывести на экран соответствующую запись.
*/
public class Test_03 {
    public static void main(String[] args) {
        print(new Beer());
        print(new Cola());

    }
    public static class Beer implements Drink{

        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }
    public static class Cola implements Drink{


        @Override
        public boolean isAlcoholic() {
            return false;
        }
    }
    public interface Drink{
        boolean isAlcoholic();
    }
    public static void print(Drink drink){
        if(drink.isAlcoholic()) System.out.println(drink.getClass().getSimpleName() + " алкогольный");
            else System.out.println(drink.getClass().getSimpleName() + " безалкогольный");




    }

}
