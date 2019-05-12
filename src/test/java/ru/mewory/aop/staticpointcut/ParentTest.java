package ru.mewory.aop.staticpointcut;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParentTest {

    @Autowired
    @Qualifier("parent")
    private Parent parent;

    @Autowired
    @Qualifier("child")
    private Parent child;

    @Test
    public void saySomething() {

        System.out.println("****** PARENT ******");

        System.out.println(parent.saySomething());

        System.out.println("****** CHILD ******");

        System.out.println(child.saySomething());

    }
}