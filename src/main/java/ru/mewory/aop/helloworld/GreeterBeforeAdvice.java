package ru.mewory.aop.helloworld;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class GreeterBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("we are going to greet someone...");
    }
}