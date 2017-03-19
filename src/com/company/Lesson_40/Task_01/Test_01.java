package com.company.Lesson_40.Task_01;

/**
 * Created by Pc on 15.02.2017.
 *//* Заметки
1. Создать класс Note
1.1 В классе Note:
 - создать статический неизменяемый список с заметками
 - создать метод addNote(String note), который добавляет новую заметку в начало списка
 - создать метод removeNote(String threadName), который удаляет заметки в списке, начиная с самой первой,
  после этого проверяет: если была удалена пустая заметка выводить надпись на экран
   "Другая нить удалила нашу заметку",
  иначе, если название заметки не начинается с имени threadName, то выводить надпись на экран в виде
  "Нить [" + threadName + "] удалила чужую заметку [" + note + "]"
2. Создай public static нить NoteThread (Runnable не является нитью),
которая в методе run 1000 раз (index = 0-999) сделает следующие действия:
2.1. используя метод addNote добавит заметку с именем [getName() + "-Note" + index], например, при index=4
"Thread-0-Note4"
2.2. используя метод removeNote удалит заметку
2.3. в качестве первого параметра в removeNote передай имя нити - метод getName()
3. В выполняющем методе запустить нить и подождать её завершения
3.1 Вывести содержимое списка notes
*/
public class Test_01 {
    public static void main(String[] args) throws InterruptedException {
        NoteThread noteThread = new NoteThread();
        noteThread.start();
        noteThread.join();
        for (int i = 0; i < Note.LIST_NOTE.size(); i++) {
            System.out.println(Note.LIST_NOTE.get(i));
        }
    }
}
