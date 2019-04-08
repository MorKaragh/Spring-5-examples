package ru.mewory.initializingbean;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
@Getter
public class InitializedObject  implements InitializingBean {

    protected String text = "this has to be changed";

    @Override
    public void afterPropertiesSet() throws Exception {
        text = "now text is nice";
    }
}
