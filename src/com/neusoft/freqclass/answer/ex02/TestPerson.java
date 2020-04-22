package com.neusoft.freqclass.answer.ex02;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("xiaowang",12);
		Person p2 = new Person("xiaowang",12);
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
	}

}
