package ru.mewory.lookup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HasMethodProxyTest {

    @Autowired
    private HasMethodProxy hasMethodProxy;

    @Test
    public void getNewObject() {

        String stringOne = hasMethodProxy.getNewObject().getId();
        String stringTwo = hasMethodProxy.getNewObject().getId();

        assertNotEquals(stringOne, stringTwo);

    }
}