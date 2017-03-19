package com.company.Lesson_24_extends_implements.Task_01;

/**
 * Created by Pc on 04.12.2016.
 */
public class AgathaChristieBook extends Book {
    private String bookName = null;

    public AgathaChristieBook(String bookName) {
        super("[Agatha Christie]");
        this.bookName = bookName;
    }

    @Override
    public AgathaChristieBook getBook() {
        return this;
    }

    @Override
    String getName() {
        return this.bookName;
    }
}
