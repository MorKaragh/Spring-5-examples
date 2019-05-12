package ru.mewory.aop.dynamicpointcut;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LuckyNumberTest {

    @Autowired
    private LuckyNumber luckyNumber;

    @Test
    public void getLuckyNumber() {
        assertEquals(7, luckyNumber.getLuckyNumber(10));
        assertEquals(7, luckyNumber.getLuckyNumber(100));
        assertEquals(147, luckyNumber.getLuckyNumber(147));
    }
}