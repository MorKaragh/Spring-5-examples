package ru.mewory.aop.helloworld;

import org.springframework.aop.framework.ProxyFactory;

public class GreeterAOP {

    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new GreeterDecorator("World"));
        proxyFactory.addAdvice(new GreeterBeforeAdvice());
        proxyFactory.setTarget(greeter);

        Greeter proxy = (Greeter) proxyFactory.getProxy();

        proxy.greet();

        System.out.println("");
        System.out.println("without any aspects");
        greeter.greet();

    }

}
