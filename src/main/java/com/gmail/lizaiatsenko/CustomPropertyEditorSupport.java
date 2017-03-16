package com.gmail.lizaiatsenko;

import java.beans.PropertyEditorSupport;

/**
 * Created by liza on 16/03/2017.
 */
public class CustomPropertyEditorSupport extends PropertyEditorSupport {
    @Override
    public void setAsText(String name) throws IllegalArgumentException {
        if(name.contains("Ms.") || name.contains("Mr.")){
            setValue(name);
        }else{
            name= "Mr." + name;
            setValue(name);
        }
    }
}
