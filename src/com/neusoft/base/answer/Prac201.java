/**
 * 1.输入两个数，求其最大公约数和最小公倍数。
 */
package com.neusoft.base.answer;

import java.util.Scanner;

public class Prac201 {

	public static void main(String[] args) {
		//接收输入的参数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个整数：");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = 0;
		//求公约数  10  25
		if(a > b) {
			min = b;
		}else {
			min = a;
		}
		//循环处理每一个可能成为a和b公约数的数，通过取余确定是否公约数
		/*for(int i = min; i >= 1 ; i--) {
			if(a % i == 0 && b % i == 0) {
				System.out.println("a和b的最大公约数 为" + i);
				break;
			}
		}*/
		int temp = 0;//临时变量，用于记录取得到的最大公约数
		for (int i = 1; i <= min; i++) {
			if(a % i == 0 && b % i == 0) {
				temp = i;
				
				//System.out.println("a和b的最大公约数 为" + i);
				
			}
		}
		System.out.println("a和b的最大公约数 为" + temp);
		
		
		
		
		
		
	}

}
