package com.company.Lesson_24_extends_implements.Task_02;

/**
 * Created by Pc on 04.12.2016.
 */
public class Finger extends BodyPart {
    private boolean isFoot;
    public Finger(String name, boolean isFoot) {

        super(name);
        this.isFoot = isFoot;
    }

    @Override
    public Object containsBones() {
        return super.containsBones().equals("Yes") && !isFoot ? "Yes" : "No";
    }
}
