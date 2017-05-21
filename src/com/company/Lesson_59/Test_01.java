package com.company.Lesson_59;

/**
 * Created by Pc on 20.05.2017.
 */
public class Test_01 {
    public static void main(String[] args) {
//        Room r = new Room();
//        System.out.print(r.c);

//        System.out.println(Room.x);

        System.out.println(Room.x);
        System.out.println(Room.x);
    }

}

// Static Build "Static House" "Static House_2" "Static Room" "Non static Build"  "b " "Non static House "h " "hn " "Go"
//"Non static Room". "h "/ 20

//Static Build
//Static House
//Static House_2
//Static Room
//10

//Static Build
//Static House
//Static House_2
//Static Room
//10
//10


class Building {
    int s = 20;

    {
        System.out.println("Non static Build");
    }

    static {
        System.out.println("Static Build");
    }

    Building() {
        System.out.print("b ");
    }

    Building(String name) {
        this();
        System.out.print("bn " + name);
    }
}

class House extends Building {
    static {
        System.out.println("Static House");
    }

    House() {
        super();
        System.out.print("h ");
    }

    House(String name) {
        this();
        System.out.print("hn " + name);
    }

    static {
        System.out.println("Static House_2");
    }

    {
        System.out.println("Non static House");
    }
}

class Room extends House {
    int c = 20;
    static int x = 10;


    Room() {
        super("Go");
        System.out.print("h ");
    }

    Room(String name) {
        this();
        System.out.print("hn " + name);
    }

    {
        System.out.println("Non static Room");
    }

    static {
        System.out.println("Static Room");
    }
}