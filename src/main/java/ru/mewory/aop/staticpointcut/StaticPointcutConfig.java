package ru.mewory.aop.staticpointcut;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StaticPointcutConfig {


    @Bean(name = "parent")
    public Parent parent(){
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new Parent());
        proxyFactory.addAdvisor(new DefaultPointcutAdvisor(new SimpleStaticPointcut(),new Advice()));
        return (Parent) proxyFactory.getProxy();
    }

    @Bean(name = "child")
    public Parent child(){
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new Child());
        proxyFactory.addAdvisor(new DefaultPointcutAdvisor(new SimpleStaticPointcut(),new Advice()));
        return (Parent) proxyFactory.getProxy();
    }

}
