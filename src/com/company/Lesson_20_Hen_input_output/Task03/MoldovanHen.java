package com.company.Lesson_20_Hen_input_output.Task03;

/**
 * Created by Pc on 16.11.2016.
 */
public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 2000;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна "  + Country.MOLDOVAN + ", Я несу " + getCountOfEggsPerMonth()
                + " яиц в месяц";
    }
}
