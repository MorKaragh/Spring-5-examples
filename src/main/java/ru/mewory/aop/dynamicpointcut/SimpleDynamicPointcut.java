package ru.mewory.aop.dynamicpointcut;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

public class SimpleDynamicPointcut extends DynamicMethodMatcherPointcut {
    @Override
    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        return method.getName().equals("getLuckyNumber")
                && targetClass == LuckyNumber.class
                && (int) args[0] == 147;
    }
}
