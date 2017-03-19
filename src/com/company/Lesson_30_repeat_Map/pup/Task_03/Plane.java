package com.company.Lesson_30_repeat_Map.pup.Task_03;

/**
 * Created by Pc on 04.01.2017.
 *//*5. Создать класс Plane, унаследовать его от Thread
6. В классе Plane:
- создать конструктор с параметром name, передать переменную name в конструктор суперкласса
- в конструкторе запустить нить
- реализовать метод run():
6.1 создать переменную isAlreadyTakenOff, подумать какой тип у переменной, инициализировать её значением по-умолчанию
6.2 пока переменная isAlreadyTakenOff имеет значение false, выполнять следующее:
- ЕСЛИ взлетная полоса свободна, занимать её
- выводить на экран надпись getName() + " взлетает"
- производить взлет самолета
- выводить на экран надпись getName() + " уже в небе"
- присвоить переменной isAlreadyTakenOff значение true
- освободить взлетную полосу
- ИНАЧЕ, если взлетная полоса занята самолетом
- выводить на экран надпись getName() + " ожидает"
- вызвать метод, который отвечает за ожидание
7. В выполняющем методе создать и запустить 3 нити(самолета)
*/
public class Plane extends Thread {

    public Plane(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        boolean isAlreadyTakenOff = false;
        while (!isAlreadyTakenOff) {
            if (Solution.RUNWAY.getThread() == null) {
                Solution.RUNWAY.setThread(this);
                System.out.println(getName() + " взлетает");
                try {
                    Solution.takingOff();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + " уже в небе");
                isAlreadyTakenOff = true;
                Solution.RUNWAY.setThread(null);
            }else if(!this.equals(Solution.RUNWAY.getThread())) {
                System.out.println(getName() +  " ожидает");
                try {
                    Solution.waiting();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

        super.run();
    }
}
