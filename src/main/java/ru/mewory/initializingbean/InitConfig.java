package ru.mewory.initializingbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitConfig {


    @Bean(initMethod = "init")
    public AnotherInitializedObject anotherInitializedObject() {
        return new AnotherInitializedObject();
    }

}
