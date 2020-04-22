package com.neusoft.array.answer;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		while(true) {
		int[] binary=new int[8];
		System.out.println("输入一个正整数：");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print(a+"的二进制表示为：");
		for(int i=binary.length-1;i>=0;i--) {
			binary[i]=a%2;
			a=a/2;
		}
		for(int i=0;i<binary.length;i++) {
			System.out.print(binary[i]);
		}
		 System.out.println();
		}
	}

}
