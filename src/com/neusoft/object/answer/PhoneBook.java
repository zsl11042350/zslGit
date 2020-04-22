package com.neusoft.object.answer;

import java.util.Scanner;

public class PhoneBook {
	String name;
	String sex;
	int age;
	String phone;
	String qq;
	String address;
	static PhoneBook[] book = new PhoneBook[100];
	static int i = 0;// 在add方法内指向最后一条数据，在方法外自增1后记录真实数组大小
	static Scanner sc = new Scanner(System.in);

	public PhoneBook(String name, String sex, int age, String phone, String qq, String address) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.qq = qq;
		this.address = address;
	}

	@Override
	public String toString() {
		return "姓名：" + name + ", 性别：" + sex + ", 年龄：" + age + ", 电话：" + phone + ", QQ：" + qq + ", 地址：" + address;
	}

	public static void main(String[] args) {
		while (true) {
			init();
			int get = sc.nextInt();
			sc.nextLine();
			if (get == 1) {
				add();
			} else if (get == 2) {
				delete();
			} else if (get == 3) {
				update();
			} else if (get == 4) {
				query();
			} else if (get == 5) {
				queryByCond();
			} else if (get == 0) {
				break;
			} else {
				System.out.println("输入有误！");
			}
		}
	}

	public static void add() {
		System.out.println("----------添加电话本----------");
		book[i] = inputInfo();
		System.out.println(book[i].toString());
		System.out.println("添加成功！");
		i++;
	}

	public static void delete() {
		boolean flag1 = false;// 删除时是否查找到姓名的标志
		System.out.println("----------刪除电话本----------");
		System.out.print("请输入要删除的姓名：");
		String name = sc.nextLine();
		for (int n = 0; n < i; n++) {
			if (book[n]!=null&&name.equals(book[n].name)) {
				flag1 = true;
				System.out.println(book[n].toString());
				System.out.println("确定要删除吗？1（是）0（否）");
				int isDelete = sc.nextInt();
				if (isDelete == 0) {
				} else if (isDelete == 1) {
					book[n]=null;
					System.out.println("刪除成功！");
				} else {
					System.out.println("输入有误！");
				}
			}
		}
		if (flag1 == false) {
			System.out.println("无信息！");
		}
	}

	public static void update() {
		boolean flag = false;// 修改时是否查找到姓名的标志
		System.out.println("----------修改电话本----------");
		System.out.print("请输入要修改的姓名：");
		String name = sc.nextLine();
		for (int n = 0; n < i; n++) {// 字符串比较相等要用equals()
			if (book[n]!=null&&name.equals(book[n].name)) {
				flag = true;
				System.out.println(book[n].toString());
				System.out.println("请重新输入信息：");
				book[n] = inputInfo();
				System.out.println(book[n].toString());
				System.out.println("修改成功！");
			}
		}
		if (flag == false) {
			System.out.println("无信息！");
		}
	}

	public static void query() {
		System.out.println("----------打印所有电话本----------");
		for (int n = 0; n < i; n++) {
			if (book[n] != null) {
				System.out.println(book[n].toString());
			}
		}
	}

	public static void queryByCond() {
		boolean flag2 = false;// 根据姓名查询是否找到姓名的标志
		System.out.println("----------根据姓名查询----------");
		System.out.print("请输入要查询的姓名：");
		String name = sc.nextLine();
		for (int n = 0; n < i; n++) {
			if (book[n] != null&&name.equals(book[n].name)) {
				flag2 = true;
				System.out.println(book[n].toString());
			}
		}
		if (flag2 == false) {
			System.out.println("无信息！");
		}
	}

	public static void init() {
		System.out.println("------------电话本管理系统-------------");
		System.out.println("1.添加	2.删除	3.修改	4.查询所有	5.根据姓名查询	0.退出");
		System.out.println("------------电话本管理系统-------------");
	}

	public static PhoneBook inputInfo() {
		System.out.print("姓名：");
		String name = sc.nextLine();
		System.out.print("性别：");
		String sex = sc.nextLine();
		System.out.print("年龄：");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("电话：");
		String phone = sc.nextLine();
		System.out.print("QQ：");
		String qq = sc.nextLine();
		System.out.print("地址：");
		String address = sc.nextLine();
		PhoneBook pb = new PhoneBook(name, sex, age, phone, qq, address);
		return pb;
	}
}
