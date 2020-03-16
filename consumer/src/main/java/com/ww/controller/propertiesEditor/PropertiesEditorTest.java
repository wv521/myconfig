package com.ww.controller.propertiesEditor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  测试属性编辑器
 * Created by ww on 2020/3/16.
 */
public class PropertiesEditorTest {
    public static void main(String[] args) {

    ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("PropertiesEditorTest.xml");
        Student student = (Student) ctx.getBean("student");
        System.out.println(student.getBirthday());

    }

}
