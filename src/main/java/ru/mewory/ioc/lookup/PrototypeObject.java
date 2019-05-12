package ru.mewory.ioc.lookup;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component("proto")
@Scope("prototype")
public class PrototypeObject {

    @Getter
    private String id = UUID.randomUUID().toString();

}
