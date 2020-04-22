package com.neusoft.object.answer;

import java.util.Scanner;

public class TestMyTime1 {

	public static void main(String[] args) {
		while(true) {
		System.out.println("---------时分秒加减器-----------");
		System.out.println("请选择操作：1加  2减  0退出");
		Scanner sc=new Scanner(System.in);
		String get=sc.nextLine();
		if(get.equals("1")) {	
			System.out.println("请输入第一个时分秒（以回车分隔）：");
			MyTime1 mt = new MyTime1(sc.nextInt(),sc.nextInt(),sc.nextInt());
			System.out.println("请再输入要相加的时分秒（以回车分隔）：");
			mt.add(sc.nextInt(), sc.nextInt(), sc.nextInt());
			sc.nextLine();
			mt.display();
		}else if(get.equals("2")) {		
			System.out.println("请输入第一个时分秒（以回车分隔）：");
			MyTime1 mt = new MyTime1(sc.nextInt(),sc.nextInt(),sc.nextInt());
			System.out.println("请再输入要相减的时分秒（以回车分隔）：");
			mt.sub(sc.nextInt(), sc.nextInt(), sc.nextInt());
			sc.nextLine();
			mt.display();
		}else if(get.equals("0")) {		
			break;
		}else {
			System.out.println("输入格式有误！");
		}
		}
	}
}
