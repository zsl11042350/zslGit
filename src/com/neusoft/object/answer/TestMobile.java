package com.neusoft.object.answer;

public class TestMobile {

	public static void main(String[] args) {
		Mobile m = new Mobile("小米6",2500,2017);
		System.out.println("当前手机情况：");
		System.out.println(m.toString());
		m.gradeFail("小米6",2500,2017);
		System.out.println(m.toString());
		m.grade(m);
		System.out.println(m.toString());
	}

}
