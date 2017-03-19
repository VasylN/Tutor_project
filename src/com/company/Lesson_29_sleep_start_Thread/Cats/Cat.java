package com.company.Lesson_29_sleep_start_Thread.Cats;

/**
 * Created by Pc on 25.12.2016.
 *//*3.1 Создать 2 объекта Kitten
3.2 Создать конструктор с параметром String name, передавать этот параметр в конструктор суперклассе
3.3 В конструкторе проинициализируйте 2 объекта Kitten:
- в параметр name первого объекта передавайте строку "Котенок 1, мама - " + getName()
- в параметр name второго объекта передавайте строку "Котенок 2, мама - " + getName()
3.4 Создать метод initAllKitten(), который запускает нити объектов Kitten
3.5 Переопределить метод run(), он должен:
- выводить в консоль надпись: getName() + " родила 2 котенка"
- вызвать метод initAllKitten()
- вывести в консоль надпись: getName() + ": Все котята в корзинке. " + getName() + " собрала их назад"
4. В выполняющем методе создать 2 объекта Cat
5. Расставь вызовы методов join() так, чтобы для каждой кошки выполнялось следующее:
5.1. Сначала кошка рожает котят.
5.2. Потом все котята вылазят из корзинки в произвольном порядке.
5.3. В конце кошка собирает их назад в корзинку.
5.4. Все события для одной кошки могут быть перемешаны с событями для другой кошки.
*/
public class Cat extends Thread {

    Kitten kitten1;
    Kitten kitten2;

    public Cat(String name) {
        super(name);
        this.kitten1 = new Kitten("Котенок 1, мама - " + getName());
        this.kitten2 = new Kitten("Котенок 2, мама - " + getName());
        start();
    }
    public void initAllKitten() throws InterruptedException {
        kitten1.start();
        kitten1.join();
        kitten2.start();
        kitten2.join();

    }

    @Override
    public void run() {
        System.out.println(getName() + " родила 2 котенка");
        try {
            initAllKitten();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад");
    }
}
