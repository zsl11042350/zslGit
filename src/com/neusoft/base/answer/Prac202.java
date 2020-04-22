/**
 * 2.求 s=a+aa+aaa+aaaa+aaaaa的值，其中a是一个数字。例如 2+22+222+2222+22222 （此时共有5个数相加）
 *  后一项 = 前一项*10 +a ；
 */
package com.neusoft.base.answer;

import java.util.Scanner;

public class Prac202 {

	public static void main(String[] args) {
		//接收输入的参数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a = sc.nextInt();
		int result = 0;//用来记录结果的变量
		int b = a;
		//循环求和
		// 2
		// 22 = 2*10 + 2     取下一项        24 =         22 + 2    取和  
		//   222 = 22*10 + 2      246 =  222 + 22 + 2
		//  2222 = 222*10 +2 
		// 因为第一次相加的数  是 0 + 2,所以要执行5次相加
		for(int i = 1 ; i <= 5 ;i++ ) {
			result += a;//result + a  取和    先加上a  
			a = a*10 + b; //变成了第二项
		}
		
		 // 1+2+3 +4 +5
		//  result = result + 下一项
		
		
		
		
		
		
	}

}
