package ru.mewory.ioc.injectcollections;

import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class HasCollection {

    @Getter
    @Resource(name = "strings")
    private List<String> stringList;

    public void printStrings() {
        stringList.forEach(System.out::println);
    }

}
