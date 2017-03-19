package com.company.Lesson_18_abstract_Interface;

/**
 * Created by Pc on 09.11.2016.
 *//*
1. Создать класс EnglishTranslator, который наследуется от абстрактного класса Translator.
   В классе Translator создать абстрактный метод getLanguage() и не абстрактный метод
    public String translate(), который возвращает строку "Я переводчик с " + getLanguage();
2. Реализовать все абстрактные методы.
3. Подумай, что должен возвращать метод getLanguage.
4. Программа должна выводить на экран "Я переводчик с английского".
*/
public class Test_05 {
    public static void main(String[] args) {
        EnglishTranslator english = new EnglishTranslator();
        FranceTranslator france = new FranceTranslator();
        System.out.println(english.translate());
        System.out.println(france.translate());

    }
    public static abstract class Translator{
        public abstract String getLanguage();
        public String translate(){
            return "Я переводчик с " + getLanguage();
        }
    }
    public static class EnglishTranslator extends Translator{
        @Override
        public String getLanguage() {
            return "английского";
        }

    }
    public static class FranceTranslator extends Translator{
        @Override
        public String getLanguage() {
            return "француского";
        }
    }
}
