package com.neusoft.base.answer;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		System.out.print("请输入圣诞树的高度：");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		for(int n=1;n<=h;n++) {
			for(int m=1;m<=h-n;m++) {
				System.out.print(" ");
			}
			for(int m=1;m<=2*n-1;m++) {
				System.out.print("*");
			}
			for(int m=1;m<=h-n;m++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}
