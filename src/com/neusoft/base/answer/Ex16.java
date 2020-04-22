package com.neusoft.base.answer;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		while(true) {
		System.out.println("请输入三个整数：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int temp=0;
		//将ab中较小的放在第一位a的位置
		if(a>b) {
			temp=a;
			a=b;
			b=temp;
		}
		//将较小数与c比较，将最小的放在第一位a的位置
		if(a>c) {
			temp=a;
			a=c;
			c=temp;
		}
		//将剩下的数的较小的放在第二位b的位置
		if(b>c) {
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println("由小到大排序为："+a+" "+b+" "+c);
/*		System.out.println("由小到大排序为：");
		if(a<=b&&a<=c) {
			System.out.println(a);
			if(b<=c) {
			System.out.println(b);
			System.out.println(c);
			}else if(c<=b) {
			System.out.println(c);
			System.out.println(b);
			}
		}else if(b<=a&&b<=c) {
			System.out.println(b);
			if(a<=c) {
			System.out.println(a);
			System.out.println(c);
			}else if(c<=a) {
			System.out.println(c);
			System.out.println(a);
			}
		}else if(c<=a&&c<=b) {
			System.out.println(c);
			if(b<=a) {
			System.out.println(b);
			System.out.println(a);
			}else if(a<=b) {
			System.out.println(a);
			System.out.println(b);
			}
		}*/
		}
	}

}
