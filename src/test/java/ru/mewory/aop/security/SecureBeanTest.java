package ru.mewory.aop.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SecureBeanTest {

    @Autowired
    private SecureBean secureBean;

    @Test
    public void getSecretMessage() {

        SecurityManager securityManager = new SecurityManager();
        securityManager.login("demyanov","storozh");

        try {
            secureBean.getSecretMessage();
            fail();
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }

        try {
            securityManager.login("zabolotny","314");
        } catch (Exception e) {
            fail();
        }

    }
}