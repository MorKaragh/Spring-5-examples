package ru.mewory.ioc.methodreplace;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HasReplacedMethodTest {

    @Autowired
    private HasReplacedMethod hasReplacedMethod;

    @Test
    public void saySomething() {
        assertEquals(hasReplacedMethod.saySomething(),"I have something to say!");
    }
}