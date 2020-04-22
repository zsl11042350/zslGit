package com.neusoft.object.answer;

import java.util.Arrays;

public class TestStudent1 {

	public static void main(String[] args) {
		Student1[] arr=new Student1[5];	
		arr[0]=new Student1(1, "小明", "男", 20, 90);
		arr[1]=new Student1(2, "小茗", "女", 21, 100);
		arr[2]=new Student1(3, "小华", "男", 22, 90);
		arr[3]=new Student1(4, "小花", "女", 20, 80);
		arr[4]=new Student1(5, "小红", "女", 19, 80);
		int[] java=new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].toString());
			java[i]=arr[i].getJava();
			sum+=java[i];
		}
		int av=sum/arr.length;
		Arrays.sort(java);
		System.out.println("Java平均值为"+av);
		System.out.println("Java最高分为"+java[java.length-1]);
		System.out.println("Java最低分为"+java[0]);
		/*com.neusoft.java._200414object.Student1 stu1 = new com.neusoft.java._200414object.Student1(1, "小明", "男", 20, 90);
		System.out.println(stu1.toString());
		com.neusoft.java._200414object.Student1 stu2 = new com.neusoft.java._200414object.Student1(2, "小茗", "女", 21, 100);
		System.out.println(stu2.toString());
		com.neusoft.java._200414object.Student1 stu3 = new com.neusoft.java._200414object.Student1(3, "小华", "男", 22, 90);
		System.out.println(stu3.toString());
		com.neusoft.java._200414object.Student1 stu4 = new com.neusoft.java._200414object.Student1(4, "小花", "女", 20, 80);
		System.out.println(stu4.toString());
		com.neusoft.java._200414object.Student1 stu5 = new com.neusoft.java._200414object.Student1(5, "小红", "女", 19, 80);
		System.out.println(stu5.toString());*/
		/*System.out.println("学号："+stu1.sNO);
		System.out.println("姓名："+stu1.sName);
		System.out.println("性别："+stu1.sSex);
		System.out.println("性别："+stu1.sAge);
		System.out.println("Java成绩："+stu1.sJava);*/		
	}

}
