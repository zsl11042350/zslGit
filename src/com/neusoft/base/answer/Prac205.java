/**
 * 输入三个整数xyz 把这三个数由小到大进行输出。
 */
package com.neusoft.base.answer;

import java.util.Scanner;

public class Prac205 {

	public static void main(String[] args) {
		//接收输入的数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个整数：");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
	//	x= 3  y= 1  z=2
	//---> x=1 y=3 z=2
		
		int temp = 0;
		// 第一轮判断 x y大小  比较小的放在第一位
		if(x > y) {
			temp = x;
			x = y;
			y = temp;
		}
		// 第二轮 拿第一位这个比较小的数去跟第一轮没有参与比较的数去比较得到3个数中最小的那一个放在第一位。
		// 经过这两轮判断得3个数中的最小值。
		if(x > z) {
			temp = z;
		    x = z;
		    z = temp;
		}
		//第三轮  拿剩余的另外两个数进行比较，调整他们的位置。
		if(y > z) {
			temp = z;
			y = z;
			z = temp;
		}
		
	}

}
