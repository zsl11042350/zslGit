package com.neusoft.object.answer.ex01;

public abstract class Teacher {
	String id;
	String name;
	String sex;
	int age;
	String education;
	String teacherTitle;
	
	public void startWork(int time) {
		System.out.println(this.name+time+"点上班");
	}
	
	public void offWork(int time) {
		System.out.println(this.name+time+"点下班");
	}
	
	public void teach(String course) {
		System.out.println(this.name+"教"+course);
	}
	
	public abstract void teachProcedure();//public abstract和abstract public都行
}
