package ru.mewory.aop.methodinterceptor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class GreeterBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("BeforeAdvice says: \"we are going to greet someone...\"");
    }
}
