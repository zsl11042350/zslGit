package com.neusoft.object.answer.ex07;

import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ManageCar mc = new ManageCar();
		
		while(true) {
		init();
		String get=sc.nextLine();
		if(get.equals("1")) {
			mc.add(inputInfo());
		}else if(get.equals("2")) {
			System.out.println("请输入汽车编号：");
			String a=sc.nextLine();
			mc.delete(a);
			System.out.println("删除数据成功！");
		}else if(get.equals("3")) {
			System.out.println("请输入汽车编号：");
			String a=sc.nextLine();
			mc.update(a);
		}else if(get.equals("4")) {
			System.out.println("请输入汽车编号：");
			String a=sc.nextLine();
			mc.query(a);
		}else if(get.equals("5")) {
			mc.queryAll();
		}else if(get.equals("0")) {
			break;
		}else {
			System.out.println("输入有误！");
		}
		}
	}
	public static void init() {
		System.out.println("|---------------|");
		System.out.println("|-----1增加 -----|");
		System.out.println("|-----2删除 -----|");
		System.out.println("|-----3修改 -----|");
		System.out.println("|-----4查询 -----|");
		System.out.println("|-----5查全 -----|");
		System.out.println("|-----0退出 -----|");
		System.out.println("|---------------|");
		System.out.println("请选择业务：");
	}
	public static Car inputInfo() {
		System.out.println("请输入汽车编号：");
		String id=sc.nextLine();
		System.out.println("请输入汽车品牌：");
		String brand=sc.nextLine();
		System.out.println("请输入汽车颜色：");
		String color=sc.nextLine();
		System.out.println("请输入裸车价格：");
		int barePrice=sc.nextInt();
		sc.nextLine();
		System.out.println("请输入汽车级别(A,B,C)：");
		String grade=sc.nextLine();
		System.out.println("请输入汽车排量：");
		Double disp=sc.nextDouble();
		sc.nextLine();
		if(grade.equals("A")||grade.equals("a")) {
			Car a = new Acar(id, brand, color, barePrice, grade, disp,0);
			a.drivePrice=a.calDrivePrice(barePrice);
			return a;
		}
		else if(grade.equals("B")||grade.equals("b")) {
			Car b = new Bcar(id, brand, color, barePrice, grade, disp,0);
			b.drivePrice=b.calDrivePrice(barePrice);
			return b;
		}
		else if(grade.equals("C")||grade.equals("c")) {
			Car c = new Ccar(id, brand, color, barePrice, grade, disp,0);
			c.drivePrice=c.calDrivePrice(barePrice);
			return c;
		}
		else {
			return null;
		}
	}
}
