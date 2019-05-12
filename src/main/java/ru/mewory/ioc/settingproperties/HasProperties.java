package ru.mewory.ioc.settingproperties;

import lombok.Getter;
import lombok.Setter;

import java.net.URL;
import java.util.List;

@Setter
@Getter
public class HasProperties {

    private List<String> stringList;
    private URL url;

    //свой класс
    private FullName fullName;

}
