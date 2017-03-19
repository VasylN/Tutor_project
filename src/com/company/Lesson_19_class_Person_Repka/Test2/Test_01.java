package com.company.Lesson_19_class_Person_Repka.Test2;

/**
 * Created by Pc on 13.11.2016.
 *//* Битва роботов
1. Создать класс Robot, BodyPart интерфейсы Attackable,Defensable и абстрактный класс AbstractRobot
2. В классе BodyPart создать переменную String bodyPart; добавить 4 объекта - части тела ( рука, нога, голова, грудь).
 Сделать объекты неизменяемыми.
3. В интерфейсе Attackable создать метод BodyPart attack();
4. В интерфейсе Defensable создать метод BodyPart defense();
5. В классе AbstractRobot создать переменные private String name; private static int hitCount;
6 В классе AbstractRobot создать логику атаки и защиты. Реализовать интерфейсы Attackable и Defensable
6.1 В методах attack() и defense() инициализировать переменную hitCount рандомным числом от 1 до 4.
    В зависимости от результата инициализации должна быть атакована и защищена определенная часть тела робота.
7. Унаследовать класс Robot от AbstractRobot. В классе Robot создать конструктор супер класса.
8. В выполняющем классе создать метод doMove(AbstractRobot robotFirst, AbstractRobot robotSecond).
8.1 В методе doMove реализовать логику вывода на экран надписи "%s атаковал робота %s, атакована %s, защищена %s"
*/
public class Test_01 {
    public static void main(String[] args) {
        Robot robot1 = new Robot("robotFirst");
        Robot robot2 = new Robot("robotSecond");
        doMove(robot1, robot2);
        doMove(robot1, robot2);
        doMove(robot2, robot1);
        doMove(robot2, robot1);

    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defensed = robotSecond.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s", robotFirst.getName(), robotSecond.getName(),
                attacked, defensed));
        if (attacked.equals(defensed)){
            System.out.println("Не задел =)");
        }else {
            System.out.println("Задел =(");
        }
    }
}
