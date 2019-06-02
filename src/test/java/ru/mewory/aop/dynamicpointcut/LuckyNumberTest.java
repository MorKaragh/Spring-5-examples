package ru.mewory.aop.dynamicpointcut;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LuckyNumberTest {

    @Autowired
    @Qualifier("simple-pointcut")
    private LuckyNumber luckyNumber;

    @Autowired
    @Qualifier("name-matched-pointcut")
    private LuckyNumber luckyNumberNameMatched;

    @Autowired
    @Qualifier("regex-matched-pointcut")
    private LuckyNumber luckyNumberRegexMatched;

    @Test
    public void getLuckyNumber() {
        assertEquals(7, luckyNumber.getLuckyNumber(10));
        assertEquals(7, luckyNumber.getLuckyNumber(100));
        assertEquals(147, luckyNumber.getLuckyNumber(147));

        assertEquals(Integer.MIN_VALUE, luckyNumberNameMatched.getUnluckyNumber(10));
        assertEquals(147, luckyNumberNameMatched.getLuckyNumber(100));
        assertEquals(147, luckyNumberNameMatched.getLuckyNumber(147));

        assertEquals(147, luckyNumberRegexMatched.getUnluckyNumber(10));
        assertEquals(147, luckyNumberRegexMatched.getLuckyNumber(100));
        assertEquals(147, luckyNumberRegexMatched.getLuckyNumber(147));
    }
}