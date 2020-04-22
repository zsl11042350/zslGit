package com.neusoft.object.teach.package1;

/**
 * @Author: wwb
 */
public class Test {
    public static void main(String[] args) {
        UserInfo1 userInfo1 = new UserInfo1();
        userInfo1.userCode = "123";
        System.err.println(userInfo1);
        String str = UserInfo1.str + "1";
        UserInfo1.getStr();

        UserInfo userInfo = new UserInfo();
        String userAcct = userInfo.userAcct;
        String userName = userInfo.userCode;

        MyInterface myInterface = new MyIntefaceImpl();
    }
}
