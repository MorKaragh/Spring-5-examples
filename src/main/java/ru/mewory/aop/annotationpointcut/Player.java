package ru.mewory.aop.annotationpointcut;

public class Player {

    @MyFunAnnotation
    public String play(){
        return "i play badly";
    }

}
