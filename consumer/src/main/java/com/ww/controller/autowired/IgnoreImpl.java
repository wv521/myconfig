package com.ww.controller.autowired;

import java.util.List;

/**
 * Created by ww on 2020/3/16.
 */
public class IgnoreImpl implements IgnoreInterface{
    private List<String> list;

    @Override
    public void setList(List<String> list) {
        this.list = list;
    }

    public List<String> getList(){
        System.out.println("============");
        return list;
    }

}
