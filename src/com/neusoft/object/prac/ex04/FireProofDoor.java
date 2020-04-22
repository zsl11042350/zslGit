package com.neusoft.object.prac.ex04;

/**
 * @Author: wwb
 * @Date: 2020/4/16 09:36
 */
public class FireProofDoor extends Door implements FireSafe {
    @Override
    void open() {
        System.out.println("防火门开启");
    }

    @Override
    void close() {
        System.out.println("防火门关闭");
    }

    @Override
    public void fireProof() {
        System.out.println("能防火");
    }
}
