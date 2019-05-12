package ru.mewory.ioc.factorybean;

import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestFactory implements FactoryBean<MessageDigest>, InitializingBean {

    private MessageDigest messageDigest;

    @Setter
    private String algorythm;

    @Override
    public MessageDigest getObject() throws Exception {
        return messageDigest;
    }

    @Override
    public Class<?> getObjectType() {
        return MessageDigest.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        messageDigest = MessageDigest.getInstance(algorythm);
    }

    public MessageDigest factoryMethod() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("MD5");
    }

}
