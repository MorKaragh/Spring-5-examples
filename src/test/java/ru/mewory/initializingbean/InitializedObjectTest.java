package ru.mewory.initializingbean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InitializedObjectTest {

    @Autowired
    private InitializedObject initializedObject;

    @Autowired
    private AnotherInitializedObject anotherInitializedObject;

    @Test
    public void test() {
        assertEquals("now text is nice",initializedObject.getText());
        System.out.println(anotherInitializedObject.getText());
    }


}