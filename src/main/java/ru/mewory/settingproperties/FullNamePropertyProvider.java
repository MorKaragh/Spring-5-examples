package ru.mewory.settingproperties;

import java.beans.PropertyEditorSupport;

public class FullNamePropertyProvider extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) {
        String[] s = text.split(" ");
        setValue(new FullName(s[0],s[1]));
    }
}
