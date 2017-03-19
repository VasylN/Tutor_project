package com.company.Lesson_18_abstract_Interface;

/**
 * Created by Pc on 09.11.2016.
 *//*
1. Создать интерфейс DBObject и создать в нем метод initializeIdAndName(long id, String name)
2. Создать класс User с параметрами long id, String name; Вынести реализацию метода initializeIdAndName в класс User.
3. initializeIdAndName в классе User должен возвращать тип User.
4. Переопределить метод toString() в классе User, что бы он выводил следующее User has name %s, id = %d
5. Создать класс Matrix и создать в нем 2 объекта используя ранее созданые интерефейс и класс.
6. В методе main вывести на экран объекты.
*/
public class Test_04 {
    public static void main(String[] args) {
        System.out.println(Matrix.user1  + "\n"+ Matrix.user2);
    }
    public static class Matrix{
       static DBObject user1 = new User().initializeIdAndName(10001, "User1");
       static DBObject user2 = new User().initializeIdAndName(10002, "User2");
    }

    public interface DBObject{
        DBObject initializeIdAndName(long id, String name);
    }

    public static class User implements DBObject{
        long id;

        @Override
        public String toString() {
            return String.format("User has name %s, id = %d", name, id);
        }

        String name;

        @Override
        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

    }
}
