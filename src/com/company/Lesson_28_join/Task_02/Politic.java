package com.company.Lesson_28_join.Task_02;

import static com.company.Lesson_28_join.Task_02.Solution.soundsInOneSpeech;

/**
 * Created by Pc on 22.12.2016.
 *//* Продвижение на политических дебатах
1. В ввыполняющем классе создать 2 статические переменные:
- int totalCountSpeeches = 200;
- int soundsInOneSpeech = 1000000;
1. Создать класс Politic, унаследовать его от Thread
2. В классе Politic создать приватную переменную int countSounds
3. Создать конструктор с параметром String name и передать этот параметр в конструктор суперкласса
4. Создать метод run и реализовать функционал:
- пока countSounds < totalCountSpeeches * soundsInOneSpeech увеличивать countSounds на один
5. В классе Politic создать метод getCountSpeaches(), который возвращает результат деления countSounds на soundsInOneSpeech
6. В классе Politic переопределить метод toString(), он должен выводить строку "%s сказал речь %d раз",
 где %s - имя нити ( имя политика ), %d - результат метода getCountSpeaches()
7. В выполняющем методе создайте 3 объекта Politic (Иванов, Петров, Сидоров)
7.1 Подождать, пока общее количество сказанных речей всеми политиками не будет равняться переменной totalCountSpeeches
7.1 Вывести на экран toString() каждого объекта
8. Нужно сделать так, чтобы Иванов сказал больше всего речей на политических дебатах.
8.1 Подумай, какой метод можно вызвать у объекта ivanov, чтобы Иванов разговаривал, пока не завершится всё свободное время.
*/
public class Politic extends Thread {
    private int countSounds;


    public Politic(String name) {
        super(name);
        start();
    }

    public  int getCountSpeaches(){
        return countSounds / soundsInOneSpeech;
    }

    @Override
    public String toString() {
        return String.format("%s сказал речь %d раз", getName(),getCountSpeaches());
    }

    @Override
    public void run() {
       while (countSounds < Solution.totalCountSpeeches * soundsInOneSpeech){
           countSounds ++;
       }
    }
}
