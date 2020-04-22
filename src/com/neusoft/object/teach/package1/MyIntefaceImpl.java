package com.neusoft.object.teach.package1;

/**
 * @Author: wwb
 * @Date: 2020/4/14 14:23
 */
//public abstract class MyIntefaceImpl implements MyInterfaceSon {
public class MyIntefaceImpl extends MyAbstract implements MyInterfaceSon {

    @Override
    public String test(String str) {
        return "1212";
    }

    @Override
    public String test1(String str) {
        return null;
    }

    @Override
    public String testt() {
        return null;
    }

    @Override
    public String test2() {
        return null;
    }
}
