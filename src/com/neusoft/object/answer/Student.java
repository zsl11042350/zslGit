package com.neusoft.object.answer;

public class Student {
	static int age;
	String name;
	String sex;
	public Student(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "这位学生的名字是" + name + ", 性别是:" + sex + ",年龄是:"+Student.age;
	}

	void beginClass(String name) {
		System.out.println(name+"开始上课了！");
	}
	
	void endClass(String name) {
		System.out.println(name+"下课了！");
	}
}
