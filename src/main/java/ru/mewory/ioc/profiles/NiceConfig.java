package ru.mewory.ioc.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("nice")
public class NiceConfig {

    @Bean
    public Greeter greeter() {
        return new NiceGreeter();
    }

}
