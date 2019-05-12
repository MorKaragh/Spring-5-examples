package ru.mewory.aop.dynamicpointcut;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamicPointcutConfig {

    @Bean
    public LuckyNumber luckyNumber(){
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvisor(new DefaultPointcutAdvisor(new SimpleDynamicPointcut(),new Advice()));
        proxyFactory.setTarget(new LuckyNumber());
        return (LuckyNumber) proxyFactory.getProxy();
    }

}
