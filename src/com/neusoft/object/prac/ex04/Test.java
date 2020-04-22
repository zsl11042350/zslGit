package com.neusoft.object.prac.ex04;

/**
 * @Author: wwb
 * @Date: 2020/4/16 09:39
 */
public class Test {
    public static void main(String[] args) {
        CommonDoor door = new MultiDoor();
        door.close();
        door.open();
        door.show();
        door.bulletProof();
        door.fireProof();
        ((MultiDoor) door).install();
    }
}
