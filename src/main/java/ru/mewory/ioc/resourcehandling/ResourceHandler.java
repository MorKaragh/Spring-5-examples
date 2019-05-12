package ru.mewory.ioc.resourcehandling;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ResourceHandler implements ApplicationContextAware {

    private ApplicationContext context;

    @Getter
    private Resource classpathFile;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @PostConstruct
    public void postConstruct() {
        classpathFile = context.getResource("classpath:beans.xml");
    }

}
