package com.neusoft.base.answer;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int i=0;
		while(i<1) {
		final double PI=3.14;
		System.out.print("1 矩形  2三角形  3圆\n请选择图形：");
		Scanner sc = new Scanner(System.in);
		int get = sc.nextInt();
		 switch (get) {
		case 1:
			System.out.print("请输入矩形的长：");
			//Scanner sc1 = new Scanner(System.in);
			Float chang = sc.nextFloat();
			System.out.print("请输入矩形的宽：");
			Float kuan = sc.nextFloat();
			System.out.println("该矩形的面积为："+chang*kuan+"\n");
			break;
		case 2:
			System.out.print("请输入三角形的底长：");
			Float di = sc.nextFloat();
			System.out.print("请输入矩形的高：");
			Float gao = sc.nextFloat();
			System.out.println("该三角形的面积为："+di*gao*0.5+"\n");
			break;
		case 3:
			System.out.print("请输入圆的半径：");
			Float radius = sc.nextFloat();
			System.out.println("该圆的面积为："+PI*radius*radius+"\n");
			break;	
		default:
			System.out.println("您输入的数据有误！\n");
			break;
		}
		 System.out.print("是否还要继续？0继续    1退出\n");
		 i = sc.nextInt();
	}
		}
}
