package ru.mewory.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class HasMethodProxy {

    /**
     *
     * при каждом обращении к методу будет браться из контекста новый объект
     *
     * */

    @Lookup("proto")
    public PrototypeObject getNewObject() {
        return null; // переопределяется автоматически
    }


}
