package com.company.Lesson_22_Singelton.Task_03;

/**
 * Created by Pc on 27.11.2016.
 */

public interface Person {
     class User implements Person{
        void live(){
           System.out.println("Usually I just live");
       }
     }
     class Looser implements Person{
         void doNothing(){
             System.out.println("Usually I do nothing");
         }
     }
     class Coder implements Person{
         void coding(){
             System.out.println("Usually I create code");
         }

     }
     class Proger implements Person{
         void enjoy(){
             System.out.println("Wonderful life!.");
         }

     }
}
