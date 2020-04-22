package com.neusoft.object.answer;

public class TestStudent {

	public static void main(String[] args) {
		Student.age=20;
		Student stu = new Student("小明", "男");
		System.out.println(stu.toString());//实例化对象后调用toString，它返回的是字符串，直接打印即可
		stu.beginClass(stu.name);
		stu.endClass(stu.name);
		Student.age=21;
		Student stu1 = new Student("小茗", "女");
		System.out.println(stu1.toString());
		stu1.beginClass(stu1.name);
		stu1.endClass(stu1.name);
	}

}
