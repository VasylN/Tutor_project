package com.company.Lesson_38_Binary_search.Task_02;

/**
 * Created by Pc on 05.02.2017.
 *//* Клубок
0. В выполняющем классе создать метод void sleep(), он должен отправлять нить в сон на 100 мс;
1. Создай интерфейс Message с одним методом void showWarning();
2. Создай 5 различных своих нитей c отличным от Thread типом:
2.1. нить 1 должна бесконечно выполняться;
2.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
2.3. нить 3 должна каждые полсекунды выводить "Ура";
2.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
2.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
3. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
4. Нити не должны стартовать автоматически.
5. В методе main запустить 2,4 и 5 нити. ( Проверить работает ли 4 нить можно при помощи метода isAlive() )
*/
public class ThreadThree extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println("Ура");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
