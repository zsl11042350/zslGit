package com.neusoft.freqclass.answer;

import java.util.Scanner;

public class Ex07 {
	static String name;
	static String psw;
	static String name2;
	static String cName;
	static String tel;
	static String mail;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("请输入用户名(10位内中英文或数字)：");
		name=sc.nextLine();
		boolean flag=test(name);
		if(flag) {
			break;
			}
		}
		System.out.println("请输入密码(10位内中英文或数字)：");
		psw=sc.nextLine();
		test(psw);
		StringBuffer bf=new StringBuffer(psw);
		bf.append("a2b13");
		bf.insert(3, "hahah");
		bf.setCharAt(2, 'c');
		bf.reverse();
		psw=bf.toString();
		System.out.println("请输入昵称(10位内中英文或数字)：");
		name2=sc.nextLine();
		test(name2);
		System.out.println("请输入中文名字：");
		cName=sc.nextLine();
		String cNameTest= "^[\u4e00-\u9fa5]+$";
		if(cName.matches(cNameTest)) {
			System.out.println(cName);
			}else {
				System.out.println("输入有误！");
		}
		System.out.println("请输入手机号：");
		tel=sc.nextLine();
		String telTest= "^[1][0-9]{10}$";
		if(tel.matches(telTest)) {
			System.out.println(tel);
			}else {
				System.out.println("输入有误！");
		}
		System.out.println("请输入邮箱：");
		mail=sc.nextLine();
		String mailTest= "^[a-zA-Z0-9][a-zA-Z0-9_-]*@([a-zA-Z0-9_-]+\\.)+(com|gov|net|com\\.cn|edu\\.cn)$";
		if(mail.matches(mailTest)) {
			System.out.println(mail);
			}else {
				System.out.println("输入有误！");
		}
		System.out.println("----您的注册信息---");
		System.out.println("用户名："+name+",密码（加密后）："+psw+",昵称："+name2+",中文名："+cName+",手机："+tel+",邮箱："+mail);
	}
	public static boolean test(String str) {
		String nameTest= "^[a-zA-Z0-9\u4e00-\u9fa5]{1,10}$";
		if(!str.matches(nameTest)) {
				System.out.println("输入有误！");
		}
		return str.matches(nameTest);
	}
}
