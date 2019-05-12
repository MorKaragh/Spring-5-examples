package ru.mewory.ioc.factorybean;

import lombok.Getter;
import lombok.Setter;

import java.security.MessageDigest;

public class HasDigest {

    @Getter
    @Setter
    private MessageDigest digest;

}
