package ru.mewory.ioc.profiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("bad")
public class BadGreeterTest {

    @Autowired
    private Greeter greeter;

    @Test
    public void getMessage() {
        assertEquals(greeter.getMessage(),BadGreeter.MESSAGE);
    }
}