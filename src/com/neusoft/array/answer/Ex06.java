package com.neusoft.array.answer;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		while(true) {
			int aaa;
		int[] binary=new int[8];
		System.out.println("����һ����������");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print(a+"�Ķ����Ʊ�ʾΪ��");
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
