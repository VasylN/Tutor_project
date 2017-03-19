package com.company.Lesson_15_checked_unchecked;

import java.io.IOException;
import java.rmi.RemoteException;

/**
 * Created by Pc on 30.10.2016.
 *//* Перехват checked исключений
В методе processExceptions обработайте все checked исключения.
Нужно вывести на экран каждое возникшее checked исключение.
Можно использовать только один блок try..
RemoteException
IOException
NoSuchFieldException
*/
public class Test_03 {
    public static void main(String[] args) {

        try {
            generation();
        } catch (NoSuchFieldException e) {
            System.out.println(e);
        } catch (RemoteException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }


    }

    public static void generation() throws IOException, NoSuchFieldException {

        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new RemoteException();
        }
        if (i == 1) {
            throw new IOException();
        }
        if (i == 2) {
            throw new NoSuchFieldException();
        }
    }
}
