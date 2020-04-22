package com.neusoft.base.answer;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int m = 0;
		while (m < 1) {
			System.out.println("输入一个正整数：");
			Scanner sc = new Scanner(System.in);
			int get = sc.nextInt();
			for (int i = 2; i <= get/2; i++) {
				if (get % i == 0) {
					System.out.println(get + "不是素数");
					get=0;
					break;
				}
			}
			if(get!=0) {
			System.out.println(get + "是素数");
			}
			/*第二种方法
			int i;
			for (i = 2; i <= get/2; i++) {
				if (get % i == 0) {
					System.out.println(get + "不是素数");
					break;
				}
			}
			//经过循环后i++一定会大于get/2，可依此找出其余条件
			if(i>get/2) {
			System.out.println(get + "是素数");
			}*/
			System.out.print("是否还要继续？0继续    1退出\n");
			m = sc.nextInt();
		}
	}
}
