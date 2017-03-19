package com.company.Lesson_30_repeat_Map.pup.Task_02;

/**
 * Created by Pc on 04.01.2017.
 *//* Обратный отсчет
1. В выполняющем классе создать статический список
2. В статическом блоке добавить 5 строк в список, в виде: "Строка " + i, где i - число от 0 до 5
3. Создать класс Countdown, реализовать в нём интерфейс Runnable
4. В классе Countdown:
- создать приватную переменную int countFrom
- создать конструктор и инициализировать в нём переменную countFrom
- создать метод printCountdown()
- реализуй логику метода printCountdown так, чтобы каждые полсекунды выводился объект из
списка в обратном порядке - от переданного индекса до нуля.
- реализовать метод run(), он должен вызывать метод printCountdown(), пока countFrom больше нуля
5. В выполняющем методе создать нить и запустить её
Пример: Передан индекс 3
Пример вывода в консоль:
Строка 2
Строка 1
Строка 0
*/
public class Countdown implements Runnable {
    private int countFrom;


    public Countdown(int countFrom) {
        this.countFrom = countFrom;
    }

    public void printCountdown() throws InterruptedException {

        for (int i = countFrom; i >= 0; i--) {
            Thread.sleep(500);
            countFrom = i;
            System.out.println(Test_02.list.get(i));
        }
    }

    @Override
    public void run() {
        while (countFrom > 0){
        try {
            printCountdown()  ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}}
