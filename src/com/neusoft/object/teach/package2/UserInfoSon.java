package com.neusoft.object.teach.package2;


import com.neusoft.object.teach.package1.UserInfo;

/**
 * @Author: wwb
 */
public class UserInfoSon extends UserInfo {

    public UserInfoSon(){
        super();
    }

    public static void main(String[] args) {
        UserInfoSon userInfo1 = new UserInfoSon();
        userInfo1.test1();
    }

    public int i = 6;

    public void test1(){
        int i = super.i;
        System.err.println(i);
    }

    @Override
    public void setUserCode(String userCode){
        this.userCode = userCode + "qaq";
    }

    public void test(){

    }
}
