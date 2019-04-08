package ru.mewory.factorybean;

import lombok.Getter;
import lombok.Setter;

import java.security.MessageDigest;

public class HasDigest {

    @Getter
    @Setter
    private MessageDigest digest;

}
