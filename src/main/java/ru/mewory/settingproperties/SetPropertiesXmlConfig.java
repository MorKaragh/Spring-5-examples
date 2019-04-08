package ru.mewory.settingproperties;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:setpropertiesconfig.xml"})
public class SetPropertiesXmlConfig {
}
