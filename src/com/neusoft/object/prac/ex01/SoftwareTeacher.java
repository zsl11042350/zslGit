package com.neusoft.object.prac.ex01;

/**
 * @Author: wwb
 * @Date: 2020/4/16 08:59
 */
public class SoftwareTeacher extends Teacher {
    @Override
    public void teachProcedure() {
        System.out.println("teach software...");
    }

    public void show(){
        System.out.println("software teacher show...");
    }
}
