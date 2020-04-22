package com.neusoft.base.answer;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int i=0;
		int grade;
		while(i<1) {
		System.out.println("请输入分数：");
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		if(mark<100 && mark>=90) {
			grade =1;
		}else if(mark<90 && mark>=80){
			grade =2;
		}else if(mark<80 && mark>=70){
			grade =3;
		}else if(mark<70 && mark>=60){
			grade =4;
		}else {
			grade =5;
		}
		switch (grade) {
		case 1:
			System.out.println("该分数对应的等级为：A");
			break;
		case 2:
			System.out.println("该分数对应的等级为：B");
			break;
		case 3:
			System.out.println("该分数对应的等级为：C");
			break;
		case 4:
			System.out.println("该分数对应的等级为：D");
			break;
		default:
			System.out.println("该分数对应的等级为：E");
			break;
		}
		System.out.print("是否还要继续？0继续    1退出\n");
		 i = sc.nextInt();
	}
	}
}
