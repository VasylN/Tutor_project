package com.company.Lesson_15_checked_unchecked;

/**
 * Created by Pc on 30.10.2016.
 *//* Деление на ноль
Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
*/
public class Test_05 {
    public static void main(String[] args) {

        try{
            divisionByZero();
        }catch (ArithmeticException e){
            System.out.println("Na nol ne lzia.....");
        }
    }
    public static void  divisionByZero(){
        int i = 0;
        int n = 10/i;
        System.out.println(n);

    }
}
