package ru.mewory.aop.throwsadvice;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThrowsAdviceConfig {

    @Bean
    public ErrorBean errorBean() {
        ErrorBean errorBean = new ErrorBean();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(errorBean);
        proxyFactory.addAdvice(new SimpleThrowsAdvice());
        return (ErrorBean) proxyFactory.getProxy();
    }


}
