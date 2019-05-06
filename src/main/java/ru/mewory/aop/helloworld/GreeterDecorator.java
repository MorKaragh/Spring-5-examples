package ru.mewory.aop.helloworld;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * в терминах АОП это "совет" (advice), окружающий точки соединения вызова метода (jointpoints)
 */
public class GreeterDecorator implements MethodInterceptor {

    private final String toGreet;

    public GreeterDecorator(String s) {
        this.toGreet = s;
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object resultVal = methodInvocation.proceed();
        System.out.print(" " + toGreet + "!\n");
        return resultVal;
    }

}
