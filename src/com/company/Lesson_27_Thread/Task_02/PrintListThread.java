package com.company.Lesson_27_Thread.Task_02;

/**
 * Created by Pc on 18.12.2016.
 */
public class PrintListThread extends Thread {


    @Override
    public void run() {
        Test_01.printList(Test_01.getList(20), getName());
    }

    public PrintListThread(String name) {
        super(name);
    }
}
