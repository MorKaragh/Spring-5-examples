package ru.mewory.methodreplace;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class Replacer implements MethodReplacer {

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        return "I have something to say!";
    }

}
