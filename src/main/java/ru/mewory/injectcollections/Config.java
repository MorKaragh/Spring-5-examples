package ru.mewory.injectcollections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class Config {

    @Bean(name = {"strings","stringlist"})
    public List<String> stringList() {
        return Arrays.asList("one","two","three");
    }

}
