package ru.mewory.ioc.initializingbean;

public class AnotherInitializedObject extends InitializedObject {

    public void init(){
        this.text = "changed again";
    }


}
