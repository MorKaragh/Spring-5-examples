package ru.mewory.aop.afterreturn;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterReturnAdvice implements AfterReturningAdvice {


    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        if (target instanceof MusicPlayer && "play".equals(method.getName())) {
            if (returnValue != null && returnValue.toString().contains("russian rap")) {
                throw new Error("SHUT UP!!!");
            }
        }
    }
}
