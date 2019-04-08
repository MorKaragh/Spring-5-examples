package ru.mewory.autowiretypes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class HasDifferentConstructorsAndSettersTest {

    @Resource(name = "byName")
    private HasDifferentConstructorsAndSetters byName;

    @Resource(name = "byType")
    private HasDifferentConstructorsAndSetters byType;

    @Resource(name = "byConstructor")
    private HasDifferentConstructorsAndSetters byConstructor;

    @Test
    public void test() {

        System.out.println("byName:");
        System.out.println(byName.toString());

        System.out.println("");
        System.out.println("byType:");
        System.out.println(byType.toString());

        System.out.println("");
        System.out.println("byConstructor:");
        System.out.println(byConstructor.toString());

    }


}