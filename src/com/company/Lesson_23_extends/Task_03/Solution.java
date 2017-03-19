package com.company.Lesson_23_extends.Task_03;

/**
 * Created by Pc on 30.11.2016.
 *//* ООП - наследование животных
1. Создать класс BigAnimal с методом protected String getSize(), который возвращает строку "как динозавр".
1. Создать класс SmallAnimal с методом String getSize(), который возвращает строку "как кошка".
1. Создать public класс Goose(Гусь).
2. Создать public класс Dragon(Дракон).
3. Унаследовать класс Goose от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
4. Унаследовать класс Dragon от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
5. В классах Goose и Dragon переопределить метод String getSize(), расширить видимость до максимальной.
6. В классе Goose метод getSize должен возвращать строку "Гусь маленький, " + [getSize родительского класса].
7. В классе Dragon метод getSize должен возвращать строку "Дракон большой, " + [getSize родительского класса].
public - protected -  default - private
private: члены класса доступны только внутри класса;
default (package-private) (модификатор, по-умолчанию): члены класса
    видны внутри пакета (если класс будет так объявлен он будет доступен только внутри пакета);
protected: члены класса доступны внутри пакета и в наследниках;
public: члены класс доступны всем;
*/
public class Solution {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        Goose goose = new Goose();
        System.out.println(dragon.getSize());
        System.out.println(goose.getSize());
    }

}
