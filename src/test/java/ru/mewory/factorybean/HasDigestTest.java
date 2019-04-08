package ru.mewory.factorybean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HasDigestTest {


    @Resource(name = "hasDigest")
    private HasDigest hasDigest;

    @Resource(name = "hasDigestFromFactoryMethod")
    private HasDigest hasDigestFromFactoryMethod;

    @Test
    public void getDigest() {
        assertNotNull(hasDigest.getDigest());
        assertEquals("SHA1", hasDigest.getDigest().getAlgorithm());

        assertNotNull(hasDigestFromFactoryMethod.getDigest());
        assertEquals("MD5", hasDigestFromFactoryMethod.getDigest().getAlgorithm());
    }
}