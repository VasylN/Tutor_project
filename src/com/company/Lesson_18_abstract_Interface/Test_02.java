package com.company.Lesson_18_abstract_Interface;

/**
 * Created by Pc on 09.11.2016.
 *//*
Создать интерфейс Drink и класс AlcoholicBeer
В интерфейсе Drink создай метод isAlcoholic();
Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
Метод  toString в классе AlcoholicBeer должен выводить на экран "Напиток алкогольный",
если isAlcoholic() возвращает true,
иначе вывести на экран надпись "Напиток безалкогольный".
*/
public class Test_02 {
    public static void main(String[] args) {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer);


    }
    public static class AlcoholicBeer implements Drink {


        @Override
        public String toString() {
            if (isAlcoholic()){
                return "Напиток алкогольный";
            }else return "Напиток безалкогольный";
        }

        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }

    public interface Drink{
         boolean isAlcoholic();
    }

}

