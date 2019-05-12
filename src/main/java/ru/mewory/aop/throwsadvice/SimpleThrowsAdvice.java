package ru.mewory.aop.throwsadvice;

import org.springframework.aop.ThrowsAdvice;

public class SimpleThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception e){
        System.out.println("Нельзя делить на ноль, просто нельзя. Смирись.");
    }

}
