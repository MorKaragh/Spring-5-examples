package ru.mewory.injectcollections;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HasCollectionTest {

    @Autowired
    private HasCollection hasCollection;

    @Test
    public void printStrings() {
        Assert.assertEquals(hasCollection.getStringList().size(),3);
    }
}