package ru.mewory.aop.annotationpointcut;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationPointcutConfig {

    @Bean
    public Player player() {
        AnnotationMatchingPointcut pointcut = AnnotationMatchingPointcut.forMethodAnnotation(MyFunAnnotation.class);
        Advisor advisor = new DefaultPointcutAdvisor(pointcut, new Advice());
        ProxyFactory proxyFactory = new ProxyFactory();
        Player player = new Player();
        proxyFactory.setTarget(player);
        proxyFactory.addAdvisor(advisor);
        return (Player) proxyFactory.getProxy();
    }

}
