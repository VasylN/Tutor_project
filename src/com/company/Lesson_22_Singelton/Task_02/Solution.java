package com.company.Lesson_22_Singelton.Task_02;

/**
 * Created by Pc on 27.11.2016.
 */
/* Мосты
1. Создать интерфейс Bridge с методом int getCarsCount().
2. Создать классы WaterBridge и SuspensionBridge, которые реализуют интерфейс Bridge.
3. Метод getCarsCount() должен возвращать любое захардкоженое значение типа int
4. Метод getCarsCount() должен возвращать различные значения для различных классов
5. В классе Solution создать публичный метод println(Bridge bridge).
6. В методе println вывести на консоль значение getCarsCount() для объекта bridge.
7. Каждый класс и интерфейс должны быть в отдельных файлах.
*/
public class Solution {
    public static void main(String[] args) {
        Bridge bridge = new WaterBridge();
        Bridge bridge1 = new SuspensionBridge();
        print(bridge);
        print(bridge1);
    }

    public static void print(Bridge bridge) {
        System.out.println(bridge.getCarsCount());

    }
}
