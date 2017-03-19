package com.company.Lesson_15_checked_unchecked;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Created by Pc on 30.10.2016.
 */
/* Исключения
Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
ArithmeticException и URISyntaxException. Как это сделать?
*/
public class Test_01 {
    public static void main(String[] args)  {

        try {
            generation();
        }

        catch (NullPointerException e){//un
            System.out.println(e);
            System.out.println("Programm is still running");
        }

        catch (FileNotFoundException  | URISyntaxException e){//ca
            System.out.println(e);
            System.out.println("Programm is still running");
        }


        System.out.println("Programm is still running - 2");

    }

    public static void generation() throws FileNotFoundException, ArithmeticException, URISyntaxException {
        int i = (int)Math.random() * 4;
        if (i == 0) {
            throw new NullPointerException();
        }
        if (i == 1) {
            throw new ArithmeticException();
        }
        if (i == 2) {
            throw new FileNotFoundException();

        }
        if (i == 3) {
            throw new URISyntaxException("", "");

        }

    }
}
