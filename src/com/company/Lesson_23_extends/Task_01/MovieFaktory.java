package com.company.Lesson_23_extends.Task_01;

import java.io.IOException;

/**
 * Created by Pc on 30.11.2016.
 *//* MovieFactory
Расширение функционала по аналогии, чтение с консоли:
1. Разобраться, что программа умеет делать.
3. Добавить абстрактный класс Movie с абстрактным методом String getGenre().
4. Добавить классы SoapOpera, Cartoon, Thriller и унаследовать их от Movie и реализовать метод String getGenre():
- в классе SoapOpera метод getGenre() должен вернуть строку "Genre is drama";
- в классе Cartoon метод getGenre() должен вернуть строку "Genre is comedy";
- в классе Thriller метод getGenre() должен вернуть строку "Genre is horror";
5. Создать класс MovieFactory с методом getMovie(String key)
5. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
5. Добавить в MovieFactory.getMovie получение объекта SoapOpera для ключа "soapOpera".
6. Добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".

7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
8. Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName() + movie.getGenre();.
*/
public class MovieFaktory {
    public static Movie getMovie(String key) throws IOException {
        Movie mov = null;
        if (key.equals("cartoon")) {
            mov = new Cartoon();
        } else if (key.equals("soapOpera")) {
            mov = new SoapOpera();
        } else if (key.equals("thriller")) {
            mov = new Thriller();

        }
        return mov;

    }
}
