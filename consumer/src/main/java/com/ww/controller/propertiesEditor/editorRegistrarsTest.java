package com.ww.controller.propertiesEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import java.util.Date;

/**
 * Created by ww on 2020/3/16.
 */
public class editorRegistrarsTest implements PropertyEditorRegistrar {


    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(Date.class, new DateEidtor());
    }
}
