package ru.mewory.aop.methodinterceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * в терминах АОП это "совет" (advice), окружающий точки соединения вызова метода (jointpoints)
 * по сути, это декоратор
 */
public class GreeterMethodInterceptor implements MethodInterceptor {

    private final String toGreet;

    public GreeterMethodInterceptor(String s) {
        this.toGreet = s;
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object resultVal = methodInvocation.proceed();
        System.out.print(" " + toGreet + "!\n");
        return resultVal;
    }

}
