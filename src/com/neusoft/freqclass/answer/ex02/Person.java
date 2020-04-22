package com.neusoft.freqclass.answer.ex02;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Person p) {
		if((p.name.equals(this.name))&&(p.age==this.age)) {
		return true;
		}else {
			return false;
		}		
	}
}
