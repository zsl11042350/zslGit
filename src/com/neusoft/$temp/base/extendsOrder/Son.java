package com.neusoft.$temp.base.extendsOrder;

public class Son extends Parent{
	public static int age;
	public String name;
	static {
		System.out.println("子类的静态代码块 age:"+age);
		age = 100;
	}
	{
		System.out.println("子类的实例代码块name:"+name);
		name ="xiaoming";
	}
	public Son() {
		System.out.println("子类构造器age:"+age);
		age =200;
	}
	public void test() {
		System.out.println("子类name:"+name+" "+"age:"+age);
	}
	

	@Override
	public String toString() {
		return "Parent [name=" + name + "age=" + age + "]";
	}

}
