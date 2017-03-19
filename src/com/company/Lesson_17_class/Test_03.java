package com.company.Lesson_17_class;

/**
 * Created by Pc on 07.11.2016.
 *//* Создать классы Cat и Dog с параметрами name и speed
Скрыть все внутренние переменные класса Cat и Dog.
 Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
 Создать метод isDogNear в классе Cat, который возвращает true, если скорость кота больше
 Создать метод isCatNear в классе Dog, который возвращает true, если скорость собаки больше
*/
public class Test_03 {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 50);
        Dog dog = new Dog("CHarly", 70);

        if (cat.isDogNear(dog)) {
            System.out.println(cat.name + " cat is winner!!!!");
        }else if(dog.isCatNear(cat)){
            System.out.println(dog.name +  " dog is winner!!!");
        }
    }
    public static class Cat{
        private  String name;
        private  int speed;

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public Cat(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }
        public boolean isDogNear(Dog dog){
            return this.speed > dog.getSpeed();
        }
    }
    public static class Dog{
        private  String name;
        private  int speed;

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public Dog(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }
        public boolean isCatNear(Cat cat){
            return this.speed > cat.getSpeed() ;
        }
    }

}
