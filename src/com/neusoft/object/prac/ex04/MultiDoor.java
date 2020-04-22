package com.neusoft.object.prac.ex04;

/**
 * @Author: wwb
 * @Date: 2020/4/16 09:38
 */
public class MultiDoor extends CommonDoor {
    @Override
    public void bulletProof() {
        System.out.println("多功能们防弹");
    }

    @Override
    void open() {
        System.out.println("多功能们开启");
    }

    @Override
    void close() {
        System.out.println("多功能们关闭");
    }

    @Override
    public void fireProof() {
        System.out.println("多功能们防火");
    }

    public void install(){
        System.out.println("多功能要安装");
    }
}
