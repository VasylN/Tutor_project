package com.company.Lesson_34.Task_01.Task_02;

/**
 * Created by Pc on 18.01.2017.
 *//* Последовательные выполнения нитей
1. В выполняющем классе создать статическую переменную int COUNT = 4
2. Создать класс SleepingThread, унаследовать его от Thread
3. В классе SleepingThread переопределить метод toString()
- Определить формат вывода, что бы он выводил нити, так как показано в примере: "#" + getName() + ": " + countDownIndex,
 где countDownIndex - число от COUNT до 1
4. Сделай так, чтобы все нити выполнялись последовательно: сначала для нити №1 отсчет с COUNT до 1,
 потом для нити №2 с COUNT до 1 и т.д.
5. В методе run после всех действий поставь задержку в 10 миллисекунд. Выведи "Нить прервана", если нить будет прервана.
6. Подумать, как должен быть реализован метод main

Пример:
#1: 4
#1: 3
...
#1: 1
#2: 4
...
*/
public class SleepingThread extends Thread {
    int countDownIndex = Test_01.COUNT;
    static int countThreads = 0;

    public SleepingThread() throws InterruptedException {
        super(String.valueOf(++countThreads));
        start();
//        join();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDownIndex == 0)
            {
               return;
            }
            try {

                Thread.sleep(10);

            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }


        }
    }

    @Override
    public String toString() {
        return "#" + getName() + ": " + countDownIndex;
    }
}
