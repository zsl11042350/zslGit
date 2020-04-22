package com.neusoft.object.teach.package1;

/**
 * @Author: wwb
 * @Date: 2020/4/14 14:15
 */
public interface MyInterface {
    int MAX_VALUE = 1;
    String test(String str);
    String test1(String str);
    default String testt(){
        return "11";
    }
    static String testt1(){
        return "22";
    }
}
