package com.neusoft.base.teach;

import com.neusoft.object.teach.package1.UserInfo;

/**
 * 方法传参测试
 */
public class ParamPassTest {

	public static void main(String[] args) {

		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("a");
		userInfo.setUserPwd("b");
        swap(userInfo);
        System.err.println("name:"+userInfo.getUserName()+",pwd:"+userInfo.getUserPwd());

        /*int a = 1;
        int b = 2;
        swap(a, b);
        System.err.println("a:"+a+",b:"+b);*/

//		String对象一旦创建，内容不可更改。每一次内容的更改都是重新创建出来的新对象。
		/*String n1="100",n2="200";
		String n3 = new String("300");
//		String n4 = new String("400");
		swap(n1, n3);*/
//        swap(n3, n4);
//		System.out.println("n1="+n1+",n2="+n2);
//        System.err.println("n3="+n3+",n4="+n4);
//        System.err.println("n1="+n1+",n3="+n3);

        Integer i = new Integer(200);
        Integer j = new Integer(400);
        swap1(i, j);
        System.out.println("i = " + i + ", j = " + j);
	}

    private static void swap(UserInfo userInfo) {
        String temp = userInfo.getUserName();
        userInfo.setUserName(userInfo.getUserPwd());
        userInfo.setUserPwd(temp);
        System.out.println(userInfo.getUserName()+","+userInfo.getUserPwd());
//        userInfo = null;
    }

    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println(n1+","+n2);
    }

    public static void swap(String n1, String n2) {
		String temp = n1;
		n1 = n2;
		n2 = temp;
        System.out.println("n11="+n1+",n22="+n2);
	}

    public static void swap1(Integer i, Integer j) {
        Integer temp = new Integer(i);
        i = j;
        j = temp;
        System.out.println(i);
    }

}