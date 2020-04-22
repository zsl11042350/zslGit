package com.neusoft.object.answer.ex05;

public abstract class Role {
	private String name;
	private int age;
	private String sex;
	
	public Role(){
		this.name="xiaoming";
		this.age=18;
		this.sex="nan";
	}
	
	public Role(String name, int age, String sex) {
		this();//在有参构造方法中调用无参构造方法
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public abstract void play();
	
	public void say() {
		System.out.println("belong to Role.say()");
	}
	
	public final void sing() {
		System.out.println("belong to Role.sing()");
	}
	
}
