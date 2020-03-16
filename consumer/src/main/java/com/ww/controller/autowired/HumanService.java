package com.ww.controller.autowired;

/**
 * Created by ww on 2020/3/16.
 */
public class HumanService {

    private Human human;

    public void test(){
        human.holle();
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
