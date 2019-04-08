package ru.mewory.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("bad")
public class BadConfig {

    @Bean
    public Greeter greeter() {
        return new BadGreeter();
    }

}
