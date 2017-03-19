package com.company.Lesson_40.Task_01;

import java.util.ArrayList;
import java.util.List;

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
public class Note {
    static final List<String> LIST_NOTE = new ArrayList<>();

    public static void addNote(String note) {
        LIST_NOTE.add(0, note);

    }

    public static void removeNote(String threadName) {
        String s = LIST_NOTE.remove(0);
        if (s == null) {
            System.out.println("Другая нить удалила нашу заметку");
        } else if (!s.startsWith(threadName)) {
            System.out.println("Нить " + threadName + " удалила чужую заметку " + s);
        }

    }
}
