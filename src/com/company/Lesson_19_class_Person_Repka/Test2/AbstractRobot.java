package com.company.Lesson_19_class_Person_Repka.Test2;

/**
 * Created by Pc on 13.11.2016.
 */
public abstract class AbstractRobot implements Defensable, Attackable {
    private String name;
    private static int hitCount;

    public String getName() {
        return name;
    }

    public AbstractRobot(String name) {
        this.name = name;

    }

    @Override
    public BodyPart attack() {
        int hitCount = (int) (Math.random() * 3 + 1);
        BodyPart atacked = null;
        if (hitCount == 1) {
            atacked = BodyPart.HEAD;
        } else if (hitCount == 2) {
            atacked = BodyPart.HAND;
        } else if (hitCount == 3) {
            atacked = BodyPart.LEG;
        } else if(hitCount == 4){
            atacked = BodyPart.BODY;
        }
            return atacked;
    }

    @Override
    public BodyPart defense() {
        int hitCount = (int) (Math.random() * 3 + 1);
        BodyPart defense = null;
        if (hitCount == 1) {
            defense = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defense = BodyPart.HAND;
        } else if (hitCount == 3) {
            defense = BodyPart.LEG;
        } else if(hitCount == 4){
            defense = BodyPart.BODY;
        }
        return defense;
    }
}