package ru.mewory.ioc.factorybean;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:factorybean.xml"})
public class FactoryBeanXmlConfig {
}
