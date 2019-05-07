package ru.mewory.aop.security;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecConfig {

    @Bean
    public SecureBean secureBean() {
        SecureBean bean = new SecureBean();
        SecurityAdvice advice = new SecurityAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(bean);
        proxyFactory.addAdvice(advice);
        return (SecureBean) proxyFactory.getProxy();
    }

}
