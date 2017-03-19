package com.company.Lesson_20_Hen_input_output.Task03;

/**
 * Created by Pc on 16.11.2016.
 */
public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 500;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна "  + Country.RUSSIAN + ", Я несу " + getCountOfEggsPerMonth()
                + " яиц в месяц";
    }
}
