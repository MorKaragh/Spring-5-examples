package ru.mewory.aop.security;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SecurityAdvice implements MethodBeforeAdvice {

    private SecurityManager securityManager;

    public SecurityAdvice() {
        this.securityManager = new SecurityManager();
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        UserInfo user = securityManager.getLoggedOnUser();

        if (user == null) {
            throw new SecurityException("нет такого дежурного!");
        } else if ("zabolotny".equals(user.getUsername()) && "314".equals(user.getPassword())){
            System.out.println("logged in");
        } else {
            throw new SecurityException("хрен вам, а не вызов метода " + method.getName());
        }
    }

}
