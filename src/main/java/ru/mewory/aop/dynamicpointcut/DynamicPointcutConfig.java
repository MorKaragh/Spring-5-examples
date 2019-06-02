package ru.mewory.aop.dynamicpointcut;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamicPointcutConfig {

    @Bean(name = "simple-pointcut")
    public LuckyNumber luckyNumber(){
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvisor(new DefaultPointcutAdvisor(new SimpleDynamicPointcut(),new Advice()));
        proxyFactory.setTarget(new LuckyNumber());
        return (LuckyNumber) proxyFactory.getProxy();
    }

    @Bean(name = "name-matched-pointcut")
    public LuckyNumber luckyNumberNameMatched(){
        ProxyFactory proxyFactory = new ProxyFactory();
        NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut()
                .addMethodName("getLuckyNumber");
        proxyFactory.addAdvisor(new DefaultPointcutAdvisor(pointcut,new Advice()));
        proxyFactory.setTarget(new LuckyNumber());
        return (LuckyNumber) proxyFactory.getProxy();
    }

    @Bean(name = "regex-matched-pointcut")
    public LuckyNumber luckyNumberRegexMatched(){
        ProxyFactory proxyFactory = new ProxyFactory();
        JdkRegexpMethodPointcut pointcut = new JdkRegexpMethodPointcut();
        pointcut.setPattern(".*ucky.*");
        proxyFactory.addAdvisor(new DefaultPointcutAdvisor(pointcut,new Advice()));
        proxyFactory.setTarget(new LuckyNumber());
        return (LuckyNumber) proxyFactory.getProxy();
    }

}
