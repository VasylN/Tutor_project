package com.company.Lesson_18_abstract_Interface.Test_06;

/**
 * Created by Pc on 09.11.2016.
 *//* Погода
1. Создать интерфейс Weather с методом getWeatherType().
2. Создать интерфейс WeatherType с перечнем погодных условий.
1. В классе Today реализовать интерфейс Weather.
2. Подумай, как связан параметр String type с методом getWeatherType().
3. Вывести на экран погодное условие.
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.s1));
        System.out.println(new Today(WeatherType.s2));
        System.out.println(new Today(WeatherType.s3));
    }
    public static class Today implements Weather {
        private String type;

        @Override
        public String toString() {
            return String.format("Сьогодні %s",getWeatherType());
        }

        public Today(String type) {
            this.type = type;
        }

        @Override
        public String getWeatherType() {
            return type;
        }
    }
}
