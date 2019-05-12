package ru.mewory.ioc.lookup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HasLookupTest {

    @Autowired
    private HasLookup hasLookup;

    @Test
    public void getNewObject() {

        String stringOne = hasLookup.getNewObject().getId();
        String stringTwo = hasLookup.getNewObject().getId();

        assertNotEquals(stringOne, stringTwo);

    }
}