package ru.mewory.aop.dynamicpointcut;

public class LuckyNumber {

    public int getLuckyNumber(int number){
        return 7;
    }

    public int getUnluckyNumber(int number){
        return Integer.MIN_VALUE;
    }

}
