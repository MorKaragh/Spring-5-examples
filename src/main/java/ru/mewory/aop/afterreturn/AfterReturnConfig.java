package ru.mewory.aop.afterreturn;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AfterReturnConfig {

    @Bean
    public MusicPlayer musicPlayer() {
        MusicPlayer musicPlayer = new MusicPlayer();
        AfterReturnAdvice afterReturnAdvice =  new AfterReturnAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(musicPlayer);
        proxyFactory.addAdvice(afterReturnAdvice);
        return (MusicPlayer) proxyFactory.getProxy();
    }

}
