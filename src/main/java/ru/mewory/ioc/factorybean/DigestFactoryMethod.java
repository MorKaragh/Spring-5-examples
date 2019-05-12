package ru.mewory.ioc.factorybean;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestFactoryMethod {

    public MessageDigest factoryMethod() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("MD5");
    }
}
