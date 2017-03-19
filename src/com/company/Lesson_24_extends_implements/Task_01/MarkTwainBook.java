package com.company.Lesson_24_extends_implements.Task_01;

/**
 * Created by Pc on 04.12.2016.
 */
public class MarkTwainBook extends Book {
    private String bookName = null;
    public MarkTwainBook(String bookName) {
        super("[Mark Twain]");
        this.bookName = bookName;
    }

    @Override
    public MarkTwainBook getBook() {
        return this;
    }

    @Override
    String getName() {
        return this.bookName;
    }
}
