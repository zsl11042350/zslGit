package com.neusoft.object.prac.ex04;

/**
 * @Author: wwb
 * @Date: 2020/4/16 09:32
 */
public abstract class Door {

    public void show(){
        System.out.println("show ...");
    }

    abstract void open();

    abstract void close();
}
