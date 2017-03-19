package com.company.Lesson_42.Task_01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 26.02.2017.
 *//* Синхронизированные заметки
1. Создать класс Note
2. В классе Note создать неизменяемый список notes
3. В классе Note создать метод removeNote(int index), который должен:
- выводить в консоль надпись "Сейчас будет удалена заметка с позиции " + index
- после удаления заметки выводить в консоль надпись "Уже удалена заметка [" + note + "] с позиции " + index
4. В классе Note создать addNote(int index, String note), который должен:
- System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
- после добавления заметки выводить в консоль надпись "Уже добавлена заметка [" + note + "]"
5. Класс Note будет использоваться нитями. Поэтому сделай так,
 чтобы обращения к листу notes блокировали мютекс notes, не this
6. Все System.out.println не должны быть заблокированы (синхронизированы), т.е. не должны находиться в блоке synchronized
*/
public class Note extends Thread {
    final static List<String> notes = new ArrayList<>();

    public static void removeNote(int index) {
        System.out.println("Сейчас будет удалена заметка с позиции " + index);
        String note;
        synchronized (notes) {
            note = notes.remove(index);
        }
        System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
    }

    public static void addNote(int index, String note) {
        System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
        synchronized (notes) {
            notes.add(index, note);
        }
        System.out.println("Уже добавлена заметка [" + note + "]");
    }}
