package com.company.Lesson_24_extends_implements.Task_01;

/**
 * Created by Pc on 04.12.2016.
 */
public abstract class Book {
    private String author;
    abstract Book getBook();
    abstract String getName();

    public Book(String author) {
        this.author = author;
    }

    public String getOutputByBookType(){
        String agathaChristieOutput = author + ", " + getBook().getName() + " is a detective";
        String markTwainOutput = getBook().getName() + " book was written by " + author;

        String output = null;
        if(this instanceof AgathaChristieBook ){
            output = agathaChristieOutput;
        }else if(this instanceof MarkTwainBook){
            output = markTwainOutput;
        }

        return output;
    }

    @Override
    public String toString() {
        return getOutputByBookType();
    }
}
