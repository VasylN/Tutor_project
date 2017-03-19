package com.company.Lesson_42.Task_01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 26.02.2017.
 *//* Сад-огород
0. Создать класс Garden
1. В классе Garden: создать неизменяемый список fruits и vegetables
1.1 Создайте метод public void addFruit(int index, String fruit) - который добавляет параметр fruit в лист fruits на позицию index
1.2 Создайте метод public void removeFruit(int index) - который удаляет из fruits элемент с индексом index
1.3 Создайте метод public void addVegetable(int index, String vegetable) - который добавляет параметр vegetable в лист vegetables на позицию index
1.4 Создайте метод public void removeVegetable(int index) - который удаляет из vegetables элемент с индексом index
1.5 Класс Garden будет использоваться нитями. Поэтому сделай так, чтобы все методы блокировали мютекс this
1.6 Реализуй это минимальным количеством кода
*/
public class Garden extends Thread{
    final static List<String> fruits  = new ArrayList<>();
    final static List<String> vegetables  = new ArrayList<>();

    public static void main(String[] args) {

    }
    public synchronized void addFruit(int index, String fruit){
        fruits.add(index,fruit);
          }
    public synchronized void removeFruit(int index){
       fruits.remove(index);
    }

    public synchronized void addVegetable(int index, String vegetable){
        vegetables.add(index,vegetable);
    }
    public synchronized void removeVegetable(int index){
        vegetables.remove(index);
    }

}

