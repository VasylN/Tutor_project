package com.company.Lesson_19_class_Person_Repka.Test2;

/**
 * Created by Pc on 13.11.2016.
 */
public final class BodyPart {
    String bodyPart;
    static final BodyPart HAND = new BodyPart("Hand");
    static final BodyPart LEG = new BodyPart("Leg");
    static final BodyPart HEAD = new BodyPart("Head");
    static final BodyPart BODY = new BodyPart("Body");

    public BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return bodyPart;
    }
}
