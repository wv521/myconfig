package com.ww.controller.propertiesEditor;


import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by ww on 2020/3/16.
 */
public class DateEidtor extends PropertyEditorSupport {

    @Override
    public void setValue(Object value) {
        super.setValue(value);
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            setValue(ss.parse(text));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
