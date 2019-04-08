package ru.mewory.settingproperties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class HasPropertiesTest {


    @Resource(name = "hasProperties")
    private HasProperties hasProperties;

    @Test
    public void test() {
        assertNotNull(hasProperties.getUrl());
        assertNotNull(hasProperties.getFullName());
        assertEquals("Sergei", hasProperties.getFullName().getName());
        assertEquals("Stepanov", hasProperties.getFullName().getSurname());
        assertFalse(hasProperties.getStringList().isEmpty());
    }

}